package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features", glue = "StepDefs")
 

public class TestNGTest extends AbstractTestNGCucumberTests {


}
