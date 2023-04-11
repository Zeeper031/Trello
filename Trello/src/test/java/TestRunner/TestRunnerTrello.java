package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\luis_\\eclipse-workspace\\Trello\\src\\test\\resources\\Features",
		glue={"StepDefinitions"},
		tags = "@test2",
		monochrome=true,
		strict=true,
		dryRun=false
		)

public class TestRunnerTrello {
	

}
