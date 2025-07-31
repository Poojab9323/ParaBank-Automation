package utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager 
{
	public static WebDriver driver;
	public static WebDriver initializeDriver() throws IOException
	{
		if(driver==null)
		{
			String browser = configReader.get("browser");
			String url = configReader.get("url");
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"src\\test\\Resources\\global.properties");
				 driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		
		return driver;
	}
	public void quitDriver()
	{
		if(driver!=null)
		{
			driver.quit();
		driver=null;
		}
	}
	
	
}
