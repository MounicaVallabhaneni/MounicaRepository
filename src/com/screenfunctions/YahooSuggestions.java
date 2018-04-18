package com.screenfunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestions
{
	public static void main(String[] args)
	
	{
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("Hello");
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for(int i=0; i<=suggestions.size()-1;i++)
		{
			String type = suggestions.get(i).getText();
			System.out.println(type);
		}
	}
	

}
