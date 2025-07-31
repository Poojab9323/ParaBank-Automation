package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage {

	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Transfer Funds')]")
	WebElement transferFundClick;
	
	@FindBy(id="amount")
	WebElement amount;
	
	@FindBy(id="fromAccountId")
	WebElement fromAccountIdDdn;
	
	@FindBy(id="toAccountId")
	WebElement toAccountIdDdn;
	
	@FindBy(css="input[Value='Transfer']")
	WebElement transferBtn;
	
	@FindBy(xpath="//h1[contains(.,'Transfer Complete!')]")
	WebElement successMsg;
	
	public TransferFundsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTransferFund()
	{
		transferFundClick.click();
	}
	
	public void enterAmount(String amt)
	{
		amount.sendKeys(amt);
	}
	
	public String getSuccessMsg()
	{
		return successMsg.getText();
	}
	
	public void selectAccounts()
	{
		Select fromAct= new Select(fromAccountIdDdn);
		fromAct.selectByIndex(0);
		Select toAct=new Select(toAccountIdDdn);
		toAct.selectByIndex(1);
	}
	public void tranferFund()
	{
		transferBtn.click();
	}
	
	
	
	
}
