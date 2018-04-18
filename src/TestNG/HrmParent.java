package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HrmParent
{
	WebDriver driver; 
	
	@BeforeMethod
	public void launch()
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	}
    
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
