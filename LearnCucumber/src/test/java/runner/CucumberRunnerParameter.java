package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/LoginMultidataScenario.feature",
				 glue="stepsParameter",
				 monochrome = true,
				 publish = true)
public class CucumberRunnerParameter extends AbstractTestNGCucumberTests {

}
