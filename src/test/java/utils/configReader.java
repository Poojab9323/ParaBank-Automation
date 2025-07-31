package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {

	
	static Properties prop;
	public static Properties loadProperties() throws IOException
	{
		prop = new Properties();
		try
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Resources\\global.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return prop;
		
	}
	
	public static String get(String key) throws IOException
	{
		if(prop==null)
		{
			loadProperties();
		}
		return prop.getProperty(key);
	}
	
}
