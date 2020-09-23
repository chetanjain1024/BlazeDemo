package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
WebDriver ldriver;
	
	public SelectFlight(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr[3]/td[1]/input")
	WebElement chooseFlightBtn;
	
	public void clickChooseFlight()
	{
		chooseFlightBtn.click();
	}
}
