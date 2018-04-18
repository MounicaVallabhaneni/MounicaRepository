package TestNG;

import org.testng.annotations.Test;

public class Child extends Parent {
	
  @Test
  public void tc01()
  {
	  System.out.println("test 01");
  }
  
  @Test
  public void tc02()
  {
	  System.out.println("test 02");
  }
}
