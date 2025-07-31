package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestSetUp {

	public WebDriver driver;
	public PageObjectManager pom;
	public DriverManager driverSetup;
	public TestSetUp() throws IOException
	{
		driverSetup= new DriverManager();
		driver = DriverManager.initializeDriver();
		pom= new PageObjectManager(driver);
		
	}
}
