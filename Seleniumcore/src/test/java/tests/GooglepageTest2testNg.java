package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Googlepage01;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglepageTest2testNg {
	static WebDriver driver=null;

	@BeforeTest
	public static void invokedriver()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Aditya\\eclipse-workspace\\Seleniumcore\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
	}
	@Test
	public void Googleelements() {
		Googlepage01 pageoject=new Googlepage01(driver);
		driver.get("https://google.com");
		pageoject.settextInsearchBox("manaswi");
		pageoject.clicksearchbutton();
	}
	@AfterTest
	public void teardowntest()
	{
		driver.close();
		driver.quit();
		System.out.println("The test is successful");
	}

}
