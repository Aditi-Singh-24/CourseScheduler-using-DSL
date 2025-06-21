package scheduler;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;
import org.aditi.course.scheduler.CourseSchedulerStandaloneSetup;
import org.aditi.course.scheduler.courseScheduler.CourseScheduler;

public class DSLParser {

    public static CourseScheduler parse(String filePath) {
        // Bootstraps the Xtext environment
        Injector injector = new CourseSchedulerStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

        // Load the resource (i.e., your DSL file)
        Resource resource = resourceSet.getResource(
            URI.createFileURI(new File(filePath).getAbsolutePath()), true
        );

        return (CourseScheduler) resource.getContents().get(0);
    }
}
