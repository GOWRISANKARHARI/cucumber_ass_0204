package testclass;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	    plugin = {"pretty", "json:target/cucumber-Report/Cucumber1.json"},
	    features = "src/test/resources/com/feature/loginHR.feature",
	    glue = "cucumber_ass_02042025"
	)

public class test extends AbstractTestNGCucumberTests{

}