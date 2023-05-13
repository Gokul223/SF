package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	@Given ("enter the userName as (.*)$")
	public LoginPage enterUsername(String uname) {
		getDriver().findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	
	@Given ("enter the password as (.*)$")
	public LoginPage enterPassword(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	@When ("click on the login button")
	public WelcomePage clickLoginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
