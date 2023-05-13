package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinition {
	public ChromeDriver driver;
	
	@Given("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
	}
	
	@Given("Load the application url")
	public void loadurl() {
		driver.get("http:leaftaps.com/opentaps/");
	}
	
	@Given("Enter the username as DemoSalesManager")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	
	@Given("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	@When("Click on the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomepage() {
		String exptTitle = "Leaftaps - TestLeaf Automation Platform";
		String actTitle = driver.getTitle();
		if(actTitle.equals(exptTitle)) {
			System.out.println("Homepage is displayed");
		}else {
			System.out.println("Homepage is not displayed");
		}
	}

}
