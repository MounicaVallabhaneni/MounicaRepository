package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HrmChild extends HrmParent {

	@Test
	public void tc01LoginHomePage() {

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user01");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

		try {
			String ele = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
			if (ele.contains("Welcome")) {
				System.out.println("Login Successfull");
			}
		}

		catch (Exception e) {
			System.out.println("Login not successful");
		}
		
	}

}

////b[text()='My Info']
////a[@id='menu_pim_viewMyDetails']/child::b[text()='My Info']