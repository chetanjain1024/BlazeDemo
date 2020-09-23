package com.PageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.TestCases.BaseClass;
import com.TestCases.Details;
import com.TestCases.HomePage;
import com.TestCases.SelectFlight;

public class TC_HomePage extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException {
		driver.get(baseURL);
		logger.info("URL is opened");
		System.out.println("browser opened");
		HomePage lp = new HomePage(driver);
		SelectFlight sf = new SelectFlight(driver);
		Details details= new Details(driver);

		Thread.sleep(5000);

		lp.setFromPort(); logger.info("from Port entered");
		Thread.sleep(5000);

		lp.setToPort();

		logger.info("to Port entered");

		Thread.sleep(3000);
		System.out.println("flight click method");
		Thread.sleep(3000);
		lp.clickFindFlight();
		logger.info("Button clicked");
		Thread.sleep(3000);
		
		sf.clickChooseFlight();
		Thread.sleep(3000);
		details.setName(name);
		Thread.sleep(1000);
		
		details.setAddress(address);
		Thread.sleep(1000);
		
		details.setCity(city);
		Thread.sleep(1000);
		 details.setState( state);
		 Thread.sleep(1000);
		details.setzipCode( zipCode);
		Thread.sleep(1000);
		details.setCardType();
		Thread.sleep(1000);
		details.setCardNumber( creditCardNumber);
		Thread.sleep(1000);
		 details.setCardMonth( month);
		 Thread.sleep(1000);
		details.setCardYear( year);
		Thread.sleep(1000);
		details.setNameOnCard( nameOnCard);
		Thread.sleep(1000);
		 details.PurchaseFlight();
		 Thread.sleep(1000);
		
	}
}
