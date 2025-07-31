package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage {

	WebDriver driver;
	
@FindBy(linkText="Open New Account")
WebElement openAccount;
	
@FindBy(id="type")
WebElement accountTypeDDN;

@FindBy(id="fromAccountId")
WebElement existingAccount;

@FindBy(css="input[value='Open New Account']")
WebElement openNewAccountBtn;

@FindBy(xpath="//h1[contains(.,'Account Opened!')]")
WebElement accountOpenMsg;

public OpenNewAccountPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void clickOpenAccountLink()
{
	openAccount.click();
}

public void selectAccountType()
{
	 new Select(accountTypeDDN).selectByVisibleText("SAVINGS");;
}

public void selectExistingAccount()
{
	new Select(existingAccount).selectByIndex(0);
}

public void clickOpenNewAccount()
{
	openNewAccountBtn.click();
}

public String getAccountOpenedText()
{
	return accountOpenMsg.getText();
}
}
