package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Child_hrm_myleave extends Parent_hrm_myleave
{
	
	
	@Test
	public void LoginHRM()
	{
		WebElement Myinfo = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/child::b[text()='My Info']"));
		Actions act = new Actions(driver); 
		act.moveToElement(Myinfo).build().perform();
		
		//driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']/child::b[text()='My Info']"));
		
	}
}

