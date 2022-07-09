package cucumberOptions;
//import org.junit.runner.RunWith;



//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

		features = "src/test/java/Features", 
		glue = "StepDefinations",
		publish = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}
