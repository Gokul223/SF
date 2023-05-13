package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass{
	
	@Then ("verify the title as crmsfa")
	public WelcomePage verifyTheTitle() {
		String title = getDriver().getTitle();
		if(title.equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("Title is " + title);
		}else {
			System.out.println("Title is not verified");
		}
		return this;
	}
	
	@When ("click on the crmsfa link")
	public HomePage clickCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}
}
