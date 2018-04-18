package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.screenfunctions.Register;

public class Tc_02 
{
	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args)
	{
		driver.get("http://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Register reg = PageFactory.initElements(driver, Register.class);
		reg.clickRegister();
		
	}

}
