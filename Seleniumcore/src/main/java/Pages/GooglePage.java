package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	static WebElement ele=null;
	public static WebElement GoogleTextBox(WebDriver driver)
	{
		ele=driver.findElement(By.name("q"));
		return ele;
		
	}
	public static WebElement GoogleSearchButton(WebDriver driver)
	{
		ele=driver.findElement(By.name("btnK"));
		return ele;
		
	}

}
