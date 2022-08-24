package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Maven_cucumber\\src\\main\\resources\\Feature",
		glue = {"stepDefinition"}
		)
public class TestRunner {

}
