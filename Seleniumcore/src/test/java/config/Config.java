package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.testng.annotations.Test;



public class Config {
	
	@Test
	public static void getBrowserproperties() throws IOException
	{
		//create a object for property class
		Properties p=new Properties();
		//create object for inputstream class
		InputStream obj=new FileInputStream("C:\\Users\\Aditya\\eclipse-workspace\\Seleniumcore\\src\\test\\java\\config\\config.properties");
		//load the properties file
		p.load(obj);
		//get the values from property file
		//p.getProperty("browser");
String brow=p.getProperty("browser");
		System.out.println("The browser is:"+brow);
	Browsers.broswerName=brow;
		
		
		
	}
	@Test
	public static void setBrowserproperties() throws IOException
	{
		Properties p=new Properties();
		OutputStream out=new FileOutputStream("C:\\Users\\Aditya\\eclipse-workspace\\Seleniumcore\\src\\test\\java\\config\\config.properties");
		p.setProperty("broswer1","firefox");
		p.setProperty("result","pass");
		p.store(out, null);
		
	}

}
