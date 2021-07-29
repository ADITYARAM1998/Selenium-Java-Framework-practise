package Reports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentreports  {
	static WebDriver driver=null;
	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("Extentreport.html");
		//create extent reports and attach reports
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlreport);
		
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("GoogleTestcase", "Search and click");
        WebDriverManager.chromedriver().setup();
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Aditya\\eclipse-workspace\\Seleniumcore\\Drivers\\chromedriver.exe" );
		 driver=new ChromeDriver();
		// log(Status, details)
	        test.log(Status.INFO, "Start the test case");
		 driver.get("htpps://google.com");
		 test.pass("navigated to google.com");
		 driver.findElement(By.name("q")).sendKeys("Hi Hello");
		 test.pass("enter the text");
		 driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		 test.pass("clicked");
		 driver.close();
		 driver.quit();
		 test.pass("closed the browser");
		 test.info("test completed");
        // calling flush writes everything to the log file
        extent.flush();
	}
	
	
}
