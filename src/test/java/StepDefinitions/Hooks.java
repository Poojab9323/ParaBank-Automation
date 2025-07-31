package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverManager;
import utils.TestSetUp;

public class Hooks {
	public static TestSetUp setUp;
	public Hooks(TestSetUp setUp)
	{
		 this.setUp = setUp;
	}
	@Before
	public void setup(Scenario scenario) throws IOException
	{
		
		setUp.driverSetup.initializeDriver();
	}
	
	@AfterStep
	public void afterEachStep() {
	    try {
	        Thread.sleep(1000); // Delay after each step
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	
	@After
	public void tearDownRegistration(Scenario scenario)
	{
		
		String scenarioName = scenario.getName().toLowerCase();
		if(scenarioName.contains("registration"))
		{
			setUp.driverSetup.quitDriver();
		}
	}
	
	@AfterAll
	public static void tearDown()
	{
		
		if(setUp.driver!=null)
		{
			setUp.driverSetup.quitDriver();
		}
			
		
	}
	
	
	
}
