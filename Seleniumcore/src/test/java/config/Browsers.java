package config;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browsers {
	WebDriver driver=null;
	public static String broswerName=null;
	
	@Test
	public static void setBrowser()

	{
		broswerName="chrome";

	}
	@Test
	public static void Brow() throws IOException
	
	
	{
	    Config.getBrowserproperties();
	
		
	    if(broswerName.contains("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			String projectLocation=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectLocation+"\\Drivers\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.facebook.com");
		}
	    if(broswerName.contains("firefox")) 
			{
				//WebDriverManager.iedriver().setup();
			String projectLocation=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",projectLocation+"\\Drivers\\geckodriver.exe" );
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.facebook.com");
			
				
			}
		
		
	}

}
