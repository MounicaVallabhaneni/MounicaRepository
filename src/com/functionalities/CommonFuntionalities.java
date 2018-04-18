package com.functionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CommonFuntionalities
{
	public static WebDriver driver = new FirefoxDriver();
	
	
	public static boolean WaitElement(WebElement element)
	{
		boolean status = true;
		for(int i=1;i<=10-1;i++)
		{
			try
			{
				System.out.println("wait is running");
				Actions act_obj = new Actions(driver);
				act_obj.moveToElement(element).build().perform();
				break;
			}
			catch(Exception e)
			{
				 try
				 {
					Thread.sleep(1000);
				 }
				 catch(Exception ex)
				 {
					 
				 }
			}
		}
		return status;
	}

}
