package runTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/feature"},
		glue= {"ejecuciones"},
		plugin= {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
		tags= {"@tag3"})
public class runner {

}
