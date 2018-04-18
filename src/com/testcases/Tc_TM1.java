package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.screenfunctions.TMAdmin;
import com.screenfunctions.TMLogin;

public class Tc_TM1 
{
	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args)
	{
		driver.get("http://server/bank/");
		TMLogin log = PageFactory.initElements(driver, TMLogin.class);
		log.loginAsAdmin();
		
		//This is for adding new staff member
		//TMAdmin admin1 = PageFactory.initElements(driver, TMAdmin.class);
		//admin1.create_newstaff();
		
		//This is for adding new customer member
		TMAdmin admin1 = PageFactory.initElements(driver, TMAdmin.class);
		admin1.create_newcustomer();
	}
	

}
