package StepDefinitions;

import org.testng.Assert;

import PageObjects.TransferFundsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSetUp;

public class TransferFundsStepDefinition {

	TestSetUp setUp;
	TransferFundsPage transferFund;
	public TransferFundsStepDefinition(TestSetUp setUp)
	{
		this.setUp=setUp;
		transferFund= setUp.pom.getTransferFundPage();
		
	}
	@Given("User navigates to Transfer Funds")
	public void user_navigates_to_transfer_funds() {
	  transferFund.clickOnTransferFund();
	}
	@When("User enters amount {string}")
	public void user_enters_amount(String amount) {
	  transferFund.enterAmount(amount);
	}
	@When("User selects from account and to account")
	public void user_selects_from_account_and_to_account() {
	   transferFund.selectAccounts();
	}
	@When("User Clicks on Transfer button")
	public void user_clicks_on_transfer_button() {
	   transferFund.tranferFund();
	}
	@Then("Transfer should be successful with confirmation message")
	public void transfer_should_be_successful_with_confirmation_message() {
	   Assert.assertTrue(transferFund.getSuccessMsg().contains("Transfer Complete"));
	}
}
