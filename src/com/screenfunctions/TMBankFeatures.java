package com.screenfunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TMBankFeatures 
{

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://server/bank/");
		List<WebElement> Features = driver.findElements(By.xpath("//h3[text()='Features']/preceding-sibling::p/following-sibling::ul/li"));
		for(int i=0; i<=Features.size()-1;i++)
		{
			String text = Features.get(i).getText();
			System.out.println(text);
		}
	}

}
