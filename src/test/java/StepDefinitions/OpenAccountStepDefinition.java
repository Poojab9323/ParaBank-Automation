package StepDefinitions;

import org.testng.Assert;

import PageObjects.OpenNewAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSetUp;

public class OpenAccountStepDefinition {

	TestSetUp setUp;
	OpenNewAccountPage newAccount;
	public OpenAccountStepDefinition(TestSetUp setUp)
	{
		this.setUp= setUp;
		newAccount = setUp.pom.getOpenNewAccountPage();
	}
	@Given("User navigates to Open New Account")
	public void user_navigates_to_open_new_account() throws InterruptedException {
	  
		Thread.sleep(1000);
		newAccount.clickOpenAccountLink();
	}
	@When("user selects savings account type")
	public void user_selects_savings_account_type() {
	    newAccount.selectAccountType();
	}
	@When("user selects existing account to transfer funds")
	public void user_selects_existing_account_to_transfer_funds() {
		newAccount.selectExistingAccount();  
	}
	@When("user clicks on Open Account button")
	public void user_clicks_on_open_account_button() {
		newAccount.clickOpenNewAccount();
	}
	@Then("New Account should be created and confirmation displayed")
	public void new_account_should_be_created_and_confirmation_displayed() throws InterruptedException {
		Thread.sleep(1000);
	   Assert.assertTrue(newAccount.getAccountOpenedText().contains("Account Opened!"));
	}
}
