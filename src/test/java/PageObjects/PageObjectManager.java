package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver= driver;
	}
	public LoginPage getLoginPage()
	{
		LoginPage login = new LoginPage(driver);
		return login;
	}
	
	public OpenNewAccountPage getOpenNewAccountPage()
	{
		OpenNewAccountPage openAccount= new OpenNewAccountPage(driver);
		return openAccount;
	}
	
	public RegistrationPage getRegistrationPage()
	{
		RegistrationPage register = new RegistrationPage(driver);
		return register;
	}
	
	public TransferFundsPage getTransferFundPage()
	{
		TransferFundsPage transferFund = new TransferFundsPage(driver);
		return transferFund;
	}
}
