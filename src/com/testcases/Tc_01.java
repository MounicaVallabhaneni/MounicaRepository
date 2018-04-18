package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.screenfunctions.Login;

public class Tc_01 {
	
	public static WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args)
	{
		driver.get("file:///D:/HTMlLogin/Login.html");
		Login lgn = PageFactory.initElements(driver, Login.class);
		lgn.login();
	}

}
