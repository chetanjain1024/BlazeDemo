package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="fromPort")
	WebElement fromPort;
	
	@FindBy(name="toPort")
	WebElement toPort;
	
	@FindBy(xpath="/html/body/div[3]/form/div/input"  )
	WebElement findFlights;
	
	
	public void setFromPort() throws InterruptedException
	{
		Select select = new Select(fromPort); 
		select.selectByVisibleText("Boston");
		
		fromPort = ldriver.switchTo().activeElement();
		fromPort.sendKeys(Keys.ESCAPE); 
	}
	public void setToPort() throws InterruptedException
	{
		Select select = new Select(toPort); 
		select.selectByVisibleText("Rome");
		
		toPort = ldriver.switchTo().activeElement();
		toPort.sendKeys(Keys.ESCAPE); 
		System.out.println(":escape clicked");
	}
	public void clickFindFlight()
	
	{
		
		findFlights.click();
		
	}
}
