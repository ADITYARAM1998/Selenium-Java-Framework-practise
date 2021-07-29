package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlepage01
{
	WebDriver driver=null;
	
	By textboxsearch = By.name("q");
	By searchButton = By.name("btnk");

	public Googlepage01(WebDriver driver)
	{
		this.driver=driver;
	}
public void settextInsearchBox(String text)
{
	driver.findElement(textboxsearch).sendKeys(text);
}
public void clicksearchbutton()
{
	//driver.findElement(searchButton).click();
	driver.findElement(searchButton).sendKeys(Keys.RETURN);
}
}
