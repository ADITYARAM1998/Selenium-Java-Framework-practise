package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_googlesearch {
	public static void main(String[] args) {
		googlesearch();
		
	}
	public static void googlesearch()
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Aditya\\eclipse-workspace\\Seleniumcore\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("manaswi");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
	}
}