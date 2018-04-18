package TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Parent {
	
	
	@BeforeSuite
	 public void add()
	 {
		System.out.println("beforeSuit");
	 }
 
	@BeforeTest
	public void sub()
	{
		System.out.println("beforeTest");
	}
	
	@BeforeClass
	public void mul()
	{
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void div()
	{
		System.out.println("beforeMethod");
	}
	
	@AfterMethod
	public void add1()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void sub1()
	{
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void mul1()
	{
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void div1()
	{
		System.out.println("Aftersuit");
	}
	

}
