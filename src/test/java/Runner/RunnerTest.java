package Runner;

import org.codehaus.groovy.transform.stc.AbstractTypeCheckingExtension;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	
	@CucumberOptions(
			
			features = {"./src/test/java"},
			glue = "Stepdef",
			//tags = "@GetByid",
			
			dryRun = false,
			
			monochrome = true,
			plugin = {
					"pretty","html:target/HTMLReports/report.html"
			}
			
			)
	
public class RunnerTest extends AbstractTestNGCucumberTests {
		
		
}
