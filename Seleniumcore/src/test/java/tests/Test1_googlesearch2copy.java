package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.GooglePage;

public class Test1_googlesearch2copy {
	static WebDriver driver=null;
	public static void main(String[] args) {
		googlesearch();
		
	}
	public static void googlesearch()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Aditya\\eclipse-workspace\\Seleniumcore\\Drivers\\chromedriver.exe" );
		 driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		//driver.findElement(By.name("q")).sendKeys("manaswi");
		GooglePage.GoogleTextBox(driver).sendKeys("Manaswi");
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GooglePage.GoogleSearchButton(driver).click();
		driver.close();
	}
}