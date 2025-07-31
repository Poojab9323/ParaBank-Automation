package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.configReader;

public class RegistrationPage {

	WebDriver driver;
	
	@FindBy(linkText="Register")
	WebElement registerBtn;
	
	@FindBy(id="customer.firstName")
	WebElement firstName;
	
	@FindBy(id="customer.lastName")
	WebElement lastName;
	
	@FindBy(id="customer.address.street")
	WebElement address;
	
	@FindBy(id="customer.address.city")
	WebElement city;
	
	@FindBy(id="customer.address.state")
	WebElement state;
	
	@FindBy(id="customer.address.zipCode")
	WebElement zipCode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement phoneNumber;
	
	@FindBy(id="customer.ssn")
	WebElement ssn;
	
	@FindBy(id="customer.username")
	WebElement username;
	
	@FindBy(id="customer.password")
	WebElement password;
	
	@FindBy(id="repeatedPassword")
	WebElement repeatedPassword;
	
	@FindBy(css="input[value='Register']")
	WebElement formRegisterBtn;
	
	@FindBy(xpath="//p[contains(text(),'Your account was created successfully. You are now logged in.')]")
	WebElement registrationSuccessMsg;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void registrationBtnClick()
	{
		registerBtn.click();
	}
	public void enterRegistrationDetails() throws IOException
	{
		firstName.sendKeys(configReader.get("firstname"));
		lastName.sendKeys(configReader.get("lastname"));
		address.sendKeys(configReader.get("Address"));
		city.sendKeys(configReader.get("City"));
		state.sendKeys(configReader.get("State"));
		zipCode.sendKeys(configReader.get("Zipcode"));
		phoneNumber.sendKeys(configReader.get("Phone"));
		ssn.sendKeys(configReader.get("SSN"));
		username.sendKeys(configReader.get("username"));
		password.sendKeys(configReader.get("password"));
		repeatedPassword.sendKeys(configReader.get("confirmPassword"));	
	}
	public void registrationFormSubmit()
	{
		formRegisterBtn.click();

	}
	public String getRegistrationSuccessMsg()
	{
		return registrationSuccessMsg.getText();
	}
}
