package org.aditi.course.scheduler.validation;

import org.aditi.course.scheduler.courseScheduler.Course;
import org.aditi.course.scheduler.courseScheduler.CourseSchedulerPackage;
import org.eclipse.xtext.validation.Check;
import org.aditi.course.scheduler.courseScheduler.Room;


// ➜ MUST extend the generated stub
public class CourseSchedulerValidator extends AbstractCourseSchedulerValidator {

	@Check
	public void checkSessionCount(Course course) {
	    if (course.getSessions() <= 0) {
	        error("Session count should be more than 0",
	              CourseSchedulerPackage.Literals.COURSE__SESSIONS);
	    }
	}

}
