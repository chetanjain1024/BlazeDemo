package com.TestCases;
import com.Utilities.ReadConfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public static WebDriver driver ;
	public static Logger logger;
	FileInputStream inputStream;
	public String name= readconfig.getName();
	public String address=readconfig.getAddress();
	public String city=readconfig.getCity();
	public String zipCode=readconfig.getzipCode();
	public String state=readconfig.getState();
	public String creditCardNumber=readconfig.getCardNumber();
	public String month=readconfig.getMonth();
	public String year=readconfig.getYear();
	public String nameOnCard=readconfig.getNameOnCard();
	
	 
	
			 
	/*
	 * // get the property value and print it out name = prop.getProperty("name");
	 * System.out.println(name); address = prop.getProperty("address");
	 * System.out.println(address); city = prop.getProperty("city");
	 * System.out.println(city); state = prop.getProperty("state");
	 * System.out.println(state); zipCode = prop.getProperty("zipCode");
	 * System.out.println(zipCode); creditCardNumber =
	 * prop.getProperty("creditCardNumber"); System.out.println(creditCardNumber);
	 * month = prop.getProperty("month"); System.out.println(month); year =
	 * prop.getProperty("year"); System.out.println(year); nameOnCard =
	 * prop.getProperty("nameOnCard"); System.out.println(nameOnCard);
	 */
		


	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		System.out.println(baseURL);
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		logger=Logger.getLogger("DemoBlaze");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath() );
		driver=new ChromeDriver();
		}
		if(br.equals("ie"))
		{
		System.setProperty("webdriver.ie.driver",readconfig.getIEpath() );
		driver=new InternetExplorerDriver();
		}
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
