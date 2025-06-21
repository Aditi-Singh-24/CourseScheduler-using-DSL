package scheduler;

import com.google.inject.Injector;
import org.aditi.course.scheduler.CourseSchedulerStandaloneSetup;
import org.aditi.course.scheduler.courseScheduler.Course;
import org.aditi.course.scheduler.courseScheduler.Room;
import org.aditi.course.scheduler.courseScheduler.CourseScheduler;
import org.aditi.course.scheduler.courseScheduler.CourseSchedulerPackage;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import java.io.File;
import java.util.Collections;

public class CourseSchedulerRunner {
    public static void main(String[] args) {
        Injector injector = new CourseSchedulerStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.setClasspathURIContext(CourseScheduler.class);

        File dslFile = new File("model/testes.mydsl");
        Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(dslFile.getAbsolutePath()), true);

        try {
            resource.load(Collections.EMPTY_MAP);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        CourseScheduler model = (CourseScheduler) resource.getContents().get(0);
        CourseSchedulerDSLAdapter adapter = new CourseSchedulerDSLAdapter();
        adapter.runSolver(model);
    }
}
