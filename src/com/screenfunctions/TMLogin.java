package com.screenfunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TMLogin
{
   @FindBy(how=How.XPATH,using="html/body/div/div[2]/ul/li[1]/a")
   public static WebElement lnk_home;
   
   @FindBy(how=How.XPATH,using="html/body/div[1]/div[2]/ul/li[2]/a")
   public static WebElement lnk_admin;
   
   @FindBy(how= How.XPATH,using="html/body/div[1]/div[3]/div/form/table/tbody/tr[4]/td/input")
   public static WebElement edi_username;
   
   @FindBy(how=How.XPATH,using="html/body/div[1]/div[3]/div/form/table/tbody/tr[6]/td/input")
   public static WebElement edi_password;
   	
   @FindBy(how=How.XPATH,using="html/body/div[1]/div[3]/div/form/table/tbody/tr[7]/td/input")
   public static WebElement btn_login;
   
      public static void loginAsAdmin()
      {
    	  lnk_home.click();
    	  lnk_admin.click();
    	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  edi_username.sendKeys("admin");
    	  edi_password.sendKeys("admin");
    	  btn_login.click();
      }
}
