package com.screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	@FindBy(how=How.XPATH,using="//input[@id='txt1']")
	public static WebElement Username;
	
	@FindBy(how=How.XPATH,using="//input[@id='txt2']")
	public static WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@id='Bt1']")
	public static WebElement Loginbtn;
	
          public static void login()
          {
        	         	 Username.sendKeys("user01");
        	         	 Password.sendKeys("pass123");
        	         	 Loginbtn.click();
          }
          
          
          
          
}
