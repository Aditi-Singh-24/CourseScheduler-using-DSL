package scheduler;

import org.aditi.course.scheduler.courseScheduler.Course;
import org.aditi.course.scheduler.courseScheduler.Room;
import org.aditi.course.scheduler.courseScheduler.Element;
import org.aditi.course.scheduler.courseScheduler.CourseScheduler;
import org.aditi.course.scheduler.courseScheduler.Day;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedulerDSLAdapter {

    public static class AdaptedCourse {
        public final String id;
        public final int studentCount;
        public final int sessions;
        public final String teacherId;
        public final List<String> batches;
        public final List<Integer> preferredDays;
        public final List<Integer> preferredSessions;

        public AdaptedCourse(String id, int studentCount, int sessions, String teacherId,
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

    public static class AdaptedRoom {
        public final String id;
        public final int capacity;

        public AdaptedRoom(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }
    }

    public static class AdaptedModel {
        public final List<AdaptedCourse> courses;
        public final List<AdaptedRoom> rooms;

        public AdaptedModel(List<AdaptedCourse> courses, List<AdaptedRoom> rooms) {
            this.courses = courses;
            this.rooms = rooms;
        }
    }

    public AdaptedModel convert(CourseScheduler model) {
        List<AdaptedCourse> courses = new ArrayList<>();
        List<AdaptedRoom> rooms = new ArrayList<>();

        for (Element element : model.getElements()) {
            if (element instanceof Course) {
                Course course = (Course) element;
                AdaptedCourse c = new AdaptedCourse(
                        course.getName(),
                        course.getStudentCount(),
                        course.getSessions(),
                        course.getTeacherId(),
                        new ArrayList<>(course.getBatches()),
                        mapDays(course.getPrefers()),
                        course.getPreferredSessions()
                );
                courses.add(c);
            } else if (element instanceof Room) {
                Room room = (Room) element;
                rooms.add(new AdaptedRoom(room.getName(), room.getCapacity()));
            }
        }

        return new AdaptedModel(courses, rooms);
    }

    private List<Integer> mapDays(List<Day> prefers) {
        List<Integer> days = new ArrayList<>();
        for (Day day : prefers) {
            days.add(dayToInt(day.getName()));
        }
        return days;
    }

    private int dayToInt(String day) {
        return switch (day.toLowerCase()) {
            case "monday" -> 0;
            case "tuesday" -> 1;
            case "wednesday" -> 2;
            case "thursday" -> 3;
            case "friday" -> 4;
            default -> -1;
        };
    }

    public void runSolver(CourseScheduler dslModel) {
        AdaptedModel adapted = convert(dslModel);

        List<scheduler.CourseScheduler.Course> courses = new ArrayList<>();
        for (AdaptedCourse c : adapted.courses) {
            courses.add(new scheduler.CourseScheduler.Course(
                    c.id, c.studentCount, c.sessions, c.teacherId,
                    c.batches, c.preferredDays, c.preferredSessions
            ));
        }

        List<scheduler.CourseScheduler.Room> rooms = new ArrayList<>();
        for (AdaptedRoom r : adapted.rooms) {
            rooms.add(new scheduler.CourseScheduler.Room(r.id, r.capacity));
        }

        scheduler.CourseScheduler.runWithData(courses, rooms);
    }
}
