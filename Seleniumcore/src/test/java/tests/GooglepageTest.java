package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Googlepage01;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglepageTest {
	static WebDriver driver=null;
	
	public static void main(String[] args) {
		googletest();
		
	}
	public static void googletest()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Aditya\\eclipse-workspace\\Seleniumcore\\Drivers\\chromedriver.exe" );
		 driver=new ChromeDriver();
		 Googlepage01 pageoject=new Googlepage01(driver);
				 driver.get("https://google.com");
		 pageoject.settextInsearchBox("manaswi");
		 pageoject.clicksearchbutton();
		 driver.close();
				 
		
	}

}
