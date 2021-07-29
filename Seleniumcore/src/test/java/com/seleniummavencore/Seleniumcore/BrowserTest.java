package com.seleniummavencore.Seleniumcore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	public static void main(String[] args) throws InterruptedException {
		String projectLocation=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\Drivers\\chromedriver.exe" );
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditya\\eclipse-workspace\\Seleniummaven\\Drivers\\chromedriver.exe" );
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.className("gLFyf gsfi"));
		//WebElement searchbox=driver.findElement(By.className("gLFyf gsfi"));
		//searchbox.sendKeys("Aditya");
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.sendKeys("Aditya");
		List<WebElement> noofwebelements=driver.findElements(By.xpath("//input"));
		//noofwebelements.size();
		int count=noofwebelements.size();
		//System.out.println("The total no of elements having input tag are:"+noofwebelements);
		System.out.println("The total no of elements having input tag are:"+count);
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}

	

}
