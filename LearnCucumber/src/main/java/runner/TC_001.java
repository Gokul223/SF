package runner;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/Login.feature",
				 glue="pages",
				 publish = true)
public class TC_001 extends BaseClass{
	
	

}
