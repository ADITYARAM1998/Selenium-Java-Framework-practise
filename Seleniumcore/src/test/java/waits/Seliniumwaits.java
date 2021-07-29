package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Seliniumwaits {
	@Test
	public void Waits()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditya\\eclipse-workspace\\Seleniumcore\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Implicit waits
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//250 ms
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Manaswi Gurram");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		driver.findElement(By.name("abcd")).sendKeys("hello");
	driver.close();
	driver.quit();
	
	}
	

}
