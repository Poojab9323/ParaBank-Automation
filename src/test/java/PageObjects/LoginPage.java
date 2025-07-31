package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.configReader;

public class LoginPage {

	WebDriver driver;
	
@FindBy(name="username")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="//input[@type='submit']")
WebElement logIn;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void enterUserName() throws IOException
{
	username.sendKeys(configReader.get("username"));
}
public void enterPassword() throws IOException
{
	password.sendKeys(configReader.get("password"));
}
public void login()
{
	logIn.click();
}

public String getTitle()
{
	return driver.getTitle();
}

	
}
