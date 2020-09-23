package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src= new File ("./Configurations/config.properties");
		try
		{
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
			}
		catch (Exception e)
		{
		System.out.println("Exception is "+ e.getMessage());	
		}
	}
	
	public String getApplicationURL()
	{
		
		String url=pro.getProperty("baseURL");
				return url;
		
	}
	
	public String getchromepath()
	{
		
		String chromepath=pro.getProperty("chromepath");
		
				return chromepath;
	}
	
	public String getIEpath() {
		String iePath=pro.getProperty("iePath");
		return iePath;
	}
	public String getName()
	{
		String name=pro.getProperty("name");
		return name;
	}
	public String getAddress()
	{
		String address=pro.getProperty("address");
		return address;
	}
	public String getCity()
	{
		String city=pro.getProperty("city");
		return city;
	}
	public String getState()
	{
		String state=pro.getProperty("state");
		return state;
	}
	public String getzipCode()
	{
		String zipCode=pro.getProperty("zipCode");
		return zipCode;
	}
	public String getCardNumber()
	{
		String creditCardNumber=pro.getProperty("creditCardNumber");
		return creditCardNumber;
	}
	public String getMonth()
	{
		String month=pro.getProperty("month");
		return month;
	}
	public String getYear()
	{
		String year=pro.getProperty("year");
		return year;
	}
	public String getNameOnCard()
	{
		String nameOnCard=pro.getProperty("nameOnCard");
		return nameOnCard;
	}
	
}
