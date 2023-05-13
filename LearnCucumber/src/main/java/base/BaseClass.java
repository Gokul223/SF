package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {
	
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver(String browser) { 
		if(browser.equalsIgnoreCase("chrome")) {
			rd.set(new ChromeDriver());
		}else if(browser.equalsIgnoreCase("edge")) {
			rd.set(new EdgeDriver());
		}
	}
	
	public RemoteWebDriver getDriver() {
		return rd.get();
	}

	@Parameters({"browser"})
	@BeforeMethod
	public void preCondition(String browser) {
		setDriver(browser);
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}
	
}
