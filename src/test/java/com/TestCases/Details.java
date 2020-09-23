package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Details {
WebDriver ldriver;
	
	public Details(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="inputName")
	WebElement txtInput;
	public void setName(String uName)
	{
		txtInput.sendKeys(uName);
	}
		
	@FindBy(id="address")
	WebElement txtAddress;
	
	public void setAddress(String address)
	{
		txtAddress.sendKeys(address);
	}
	
	@FindBy(id="city")
	WebElement txtCity;
	public void setCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	@FindBy(id="state")
	WebElement txtState;
	

	public void setState(String state)
	{
		txtState.sendKeys(state);
	}
	
	
	@FindBy(id="zipCode")
	WebElement txtzipCode;
	
	public void setzipCode(String zipCode)
	{
		txtzipCode.sendKeys(zipCode);
	}
	
	@FindBy(id="cardType")
	WebElement txtcardType;
	
	public void setCardType()
	{
		Select select = new Select(txtcardType); 
		select.selectByVisibleText("American Express");
		
	}
	
	@FindBy(id="creditCardNumber")
	WebElement txtcreditCardNumber;
	
	public void setCardNumber(String cardNumber)
	{
		txtcreditCardNumber.sendKeys(cardNumber);
	}
	@FindBy(id="creditCardMonth")
	WebElement txtcreditCardMonth;
	
	public void setCardMonth(String cardMonth)
	{
		txtcreditCardMonth.clear();
		txtcreditCardMonth.sendKeys(cardMonth);
	}
	
	@FindBy(id="creditCardYear")
	WebElement txtcreditCardYear;
	

	public void setCardYear(String cardYear)
	{
		txtcreditCardYear.clear();
		txtcreditCardYear.sendKeys(cardYear);
	}
	
	@FindBy(id="nameOnCard")
	WebElement txtnameOnCard;
	public void setNameOnCard(String nameOnCard)
	{
		
		txtnameOnCard.sendKeys(nameOnCard);
	}
	
	@FindBy(xpath="/html/body/div[2]/form/div[11]/div/input")
	WebElement btnPurchaseFlight;	
	
	public void PurchaseFlight()
	{
		btnPurchaseFlight.click();
	}
}
