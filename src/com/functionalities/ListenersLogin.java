package com.functionalities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class ListenersLogin extends CommonFuntionalities
{
	@FindBy(how=How.XPATH,using="//input[@name='uname']")
	public static WebElement Username;
	
	@FindBy(how=How.XPATH,using="//input[@name='pwd']")
	public static  WebElement pasword;
	
	@FindBy(how=How.XPATH,using="//input[@name='submitBtn']")
	public static  WebElement Button;

	public static SoftAssert assrt = new SoftAssert();
	
	public static void verify_Fields()
	{
		boolean fstatus = true;
		fstatus=WaitElement(Username);
		if(fstatus)
		{
			assrt.assertTrue(Username.isDisplayed());
			assrt.assertAll();
		}
		
		fstatus=WaitElement(pasword);
		if(fstatus)
		{
			assrt.assertTrue(pasword.isDisplayed());
			assrt.assertAll();
		}
		
		fstatus=WaitElement(Button);
		if(fstatus)
		{
			assrt.assertTrue(false);
			assrt.assertAll();
		}
	}
	
}