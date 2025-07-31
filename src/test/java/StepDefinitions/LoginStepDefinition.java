package StepDefinitions;

import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSetUp;
import utils.configReader;

public class LoginStepDefinition {

	WebDriver driver;
	LoginPage login;
	DriverManager dm;
	TestSetUp setUp;
	public LoginStepDefinition(TestSetUp setUp)
	{
		this.setUp = setUp;
		this.driver = setUp.driver;
		login = setUp.pom.getLoginPage();
	}
	
	@Given("User is on Login Page")
	public void User_is_on_Login_Page()
	{
		Assert.assertTrue(login.getTitle().contains("Welcome"));
	}
	@When("User enters username and password")
	public void User_enters_username_and_password() throws IOException
	{
		login.enterUserName();
		login.enterPassword();
	}
	@When("User clicks on Login button")
	public void User_clicks_on_Login_button()
	{
		login.login();
	}
	@Then("User should be redirected to Account Overview Page")
	public void User_should_be_redirected_to_Account_Overview_Page()
	{
		
		Assert.assertTrue(driver.getCurrentUrl().contains("overview"));
	}
}
