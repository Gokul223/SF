package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass {

	@Then ("verify the title as welcomePage")
	public HomePage verifyTheTitle() {
		String title = getDriver().getTitle();
		if(title.equalsIgnoreCase("My Home | opentaps CRM")) {
			System.out.println("Title is " + title);
		}else {
			System.out.println("Title is not verified");
		}
		return this;
	}
	
	@When ("click on the leads tab")
	public LeadPage clickLeadsTab() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new LeadPage();
	}
	
}
