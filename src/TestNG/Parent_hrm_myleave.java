package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Parent_hrm_myleave 
{
      WebDriver driver;
      @BeforeMethod
      public void launch()
      {
    	  driver = new FirefoxDriver();
    	  driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
    	driver.findElement(By.xpath("//input[@id='txtUsername'")).sendKeys("User01");
 		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("pass1234");
 		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
      }
      
      @AfterMethod
      public void close()
      {
    	  driver.close();
      }
}
