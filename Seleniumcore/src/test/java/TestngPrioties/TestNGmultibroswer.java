package TestngPrioties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGmultibroswer {
	WebDriver driver=null;
	String projectPath=System.getProperty("user.dir");
	
	@Parameters({"browserName"})
	@BeforeTest
	public void setup(String browserName)
	{
		System.out.println("The browser is "+browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe" );
			//WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//WebDriverManager.geckodriver().setup();
			System.setProperty("webdriver.gecko.driver",projectPath+"/Drivers/geckodriver.exe" );
	       driver=new FirefoxDriver();
			//driver.get("http://www.facebook.com");
		}
		
	
		
	}
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.linkedin.com/in/aditya-mallela-552284178/");
		Thread.sleep(3000);
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("The test runned successfully");
	}

}
