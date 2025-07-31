package StepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import PageObjects.RegistrationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSetUp;

public class RegistrationStepDefinition {

	TestSetUp setUp;
	RegistrationPage register;
	public RegistrationStepDefinition(TestSetUp setUp)
	{
		this.setUp=setUp;
		register= setUp.pom.getRegistrationPage();
		
	}
	@When("User clicks on Register link")
	public void user_clicks_on_register_link() {
	    register.registrationBtnClick();
	}
	@When("User enters all the required information")
	public void user_enters_all_the_required_information() throws IOException {
	   register.enterRegistrationDetails();
	}
	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
	    register.registrationFormSubmit();
	}
	@Then("User should be see registration confirmation")
	public void user_should_be_see_registration_confirmation() {
	  String text = register.getRegistrationSuccessMsg();
	  Assert.assertEquals("Your account was created successfully. You are now logged in.", text);
	}

}
