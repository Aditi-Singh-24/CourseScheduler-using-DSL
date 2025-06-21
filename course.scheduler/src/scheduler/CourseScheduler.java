package scheduler;

import com.google.ortools.Loader;
import com.google.ortools.sat.*;

import java.util.*;

public class CourseScheduler {

    public static class Course {
        public final String id;
        public final int studentCount;
        public final int sessions;
        public final String teacherId;
        public final List<String> batches;
        public final List<Integer> preferredDays;
        public final List<Integer> preferredSessions;

        public Course(String id, int studentCount, int sessions, String teacherId,
                      List<String> batches, List<Integer> preferredDays, List<Integer> preferredSessions) {
            this.id = id;
            this.studentCount = studentCount;
            this.sessions = sessions;
            this.teacherId = teacherId;
            this.batches = batches;
            this.preferredDays = preferredDays;
            this.preferredSessions = preferredSessions;
        }
    }

    public static class Room {
        public final String id;
        public final int capacity;

        public Room(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }
    }

    public static void runWithData(List<Course> courses, List<Room> rooms) {
        Loader.loadNativeLibraries();

        int numCourses = courses.size();
        int numRooms = rooms.size();
        int numDays = 5;
        int numSlots = 4;

        CpModel model = new CpModel();

        IntVar[][][] roomVars = new IntVar[numCourses][numDays][numSlots];
        for (int c = 0; c < numCourses; c++) {
            for (int d = 0; d < numDays; d++) {
                for (int s = 0; s < numSlots; s++) {
                    roomVars[c][d][s] = model.newIntVar(-1, numRooms - 1, "x_c" + c + "_d" + d + "_s" + s);
                }
            }
        }

        for (int c = 0; c < numCourses; c++) {
            List<BoolVar> usedSlots = new ArrayList<>();
            for (int d = 0; d < numDays; d++) {
                for (int s = 0; s < numSlots; s++) {
                    BoolVar used = model.newBoolVar("used_c" + c + "_d" + d + "_s" + s);

                    // If used == true ⇒ roomVars[c][d][s] ≠ -1
                    model.addDifferent(roomVars[c][d][s], -1).onlyEnforceIf(used);

                    // If used == false ⇒ roomVars[c][d][s] == -1
                    model.addEquality(roomVars[c][d][s], -1).onlyEnforceIf(used.not());

                    usedSlots.add(used);
                }
            }

            // Total number of used time slots for the course must match its session count
            model.addEquality(LinearExpr.sum(usedSlots.toArray(new BoolVar[0])), courses.get(c).sessions);
        }


        for (int d = 0; d < numDays; d++) {
            for (int s = 0; s < numSlots; s++) {
                for (int r = 0; r < numRooms; r++) {
                    List<BoolVar> uses = new ArrayList<>();
                    for (int c = 0; c < numCourses; c++) {
                        BoolVar use = model.newBoolVar("r" + r + "_used_c" + c + "_d" + d + "_s" + s);

                        // If use == true ⇒ roomVars[c][d][s] == r
                        model.addEquality(roomVars[c][d][s], r).onlyEnforceIf(use);

                        // If use == false ⇒ roomVars[c][d][s] ≠ r
                        model.addDifferent(roomVars[c][d][s], r).onlyEnforceIf(use.not());

                        // Hard constraint: don't allow assigning rooms with insufficient capacity
                        if (courses.get(c).studentCount > rooms.get(r).capacity) {
                            model.addDifferent(roomVars[c][d][s], r);
                        }

                        uses.add(use);
                    }

                    // Ensure that at most one course uses the room at this (day, slot)
                    model.addLessOrEqual(LinearExpr.sum(uses.toArray(new BoolVar[0])), 1);
                }
            }
        }


        for (int c1 = 0; c1 < numCourses; c1++) {
            for (int c2 = c1 + 1; c2 < numCourses; c2++) {
                boolean conflict = !Collections.disjoint(courses.get(c1).batches, courses.get(c2).batches) ||
                        courses.get(c1).teacherId.equals(courses.get(c2).teacherId);

                if (!conflict) continue;

                for (int d = 0; d < numDays; d++) {
                    for (int s = 0; s < numSlots; s++) {
                        BoolVar c1Used = model.newBoolVar("c1Used_" + c1 + "_d" + d + "_s" + s);
                        BoolVar c2Used = model.newBoolVar("c2Used_" + c2 + "_d" + d + "_s" + s);

                        model.addDifferent(roomVars[c1][d][s], -1).onlyEnforceIf(c1Used);
                        model.addEquality(roomVars[c1][d][s], -1).onlyEnforceIf(c1Used.not());

                        model.addDifferent(roomVars[c2][d][s], -1).onlyEnforceIf(c2Used);
                        model.addEquality(roomVars[c2][d][s], -1).onlyEnforceIf(c2Used.not());

                        // Add OR: if both are scheduled at the same time, it's invalid
                        model.addBoolOr(new Literal[]{
                        	    c1Used.not(),
                        	    c2Used.not()
                        	});
                    }
                }
            }
        }

        List<IntVar> penaltyVars = new ArrayList<>();
        int penaltyWeight = 100000;

        for (int c = 0; c < numCourses; c++) {
            Course course = courses.get(c);
            for (int d = 0; d < numDays; d++) {
                for (int s = 0; s < numSlots; s++) {
                    if (!course.preferredDays.contains(d) || !course.preferredSessions.contains(s)) {
                        BoolVar violated = model.newBoolVar("penalty_c" + c + "_d" + d + "_s" + s);
                        model.addDifferent(roomVars[c][d][s], -1).onlyEnforceIf(violated);
                        model.addEquality(roomVars[c][d][s], -1).onlyEnforceIf(violated.not());
                        IntVar weightedPenalty = model.newIntVar(0, penaltyWeight, "weighted_penalty_c" + c + "_d" + d + "_s" + s);
                        model.addMultiplicationEquality(weightedPenalty, new IntVar[]{violated, model.newConstant(penaltyWeight)});
                        penaltyVars.add(weightedPenalty);
                    }
                }
            }
        }

        model.minimize(LinearExpr.sum(penaltyVars.toArray(new IntVar[0])));




        CpSolver solver = new CpSolver();
        solver.getParameters().setLogSearchProgress(true);
        CpSolverStatus status = solver.solve(model);

        if (status == CpSolverStatus.OPTIMAL || status == CpSolverStatus.FEASIBLE) {
            for (int c = 0; c < numCourses; c++) {
                System.out.println("Course " + courses.get(c).id);
                for (int d = 0; d < numDays; d++) {
                    for (int s = 0; s < numSlots; s++) {
                        int r = (int) solver.value(roomVars[c][d][s]);
                        if (r != -1) {
                        	String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
                        	System.out.printf("  Day %s Slot %d Room %s\n", dayNames[d], s, rooms.get(r).id);

                        }
                    }
                }
            }
        } else {
            System.out.println("No feasible solution found.");
        }
    }
}
