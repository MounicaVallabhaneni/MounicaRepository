package com.screenfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TMAdmin
{
    @FindBy(how=How.XPATH,using="//a[text()='Add staff member']")
    public static WebElement lnk_addstaffmem1;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_name']")  
    public static WebElement edi_staffname;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_gender'][@value='F']")
    public static WebElement btn_gender;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_dob']")
    public static WebElement edi_DOB;
    
    @FindBy(how=How.XPATH,using="//select[@name='staff_status']/option[1]")
    public static WebElement edi_relation;
    
    @FindBy(how=How.XPATH,using="//select[@name='staff_dept']/option[1]")
    public static WebElement edi_department;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_doj']")
    public static WebElement edi_DOJ;
    
    @FindBy(how=How.XPATH,using="//*[@name='staff_address']")
    public static WebElement edi_address;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_mobile']")
    public static WebElement edi_mobile;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_email']")
    public static WebElement edi_email;
    
    @FindBy(how=How.XPATH,using="//input[@name='staff_pwd']")
    public static WebElement edi_password;
    
    @FindBy(how=How.XPATH,using="//input[@name='add_staff']")
    public static WebElement btn_addmem;
    
    
    
    @FindBy(how=How.XPATH,using="//a[text()='Add Customer']")
    public static WebElement lnk_addcustomer;
    	
    @FindBy(how=How.XPATH,using="//input[@name='customer_name']")  
    public static WebElement edi_cutomername;
    
    @FindBy(how=How.XPATH,using="//input[@name='customer_gender'][@value='M']")  
    public static WebElement btn_cusgender;
    
    @FindBy(how=How.XPATH,using="//input[@name='customer_dob']")  
    public static WebElement edi_customerdob;
    
    @FindBy(how=How.XPATH,using="//input[@name='customer_nominee']")  
    public static WebElement edi_customernomini;
    
    @FindBy(how=How.XPATH,using="//*[@name='branch']/option[1]")  
    public static WebElement edi_customerbranch;
    
    @FindBy(how=How.XPATH,using="//*[@name='customer_account']/option[1]")  
    public static WebElement edi_customreaccount;
    
    @FindBy(how=How.XPATH,using="//input[@name='initial']")
    public static WebElement edi_minamount;
    
    @FindBy(how=How.XPATH,using="//*[@name='customer_address']")
    public static WebElement edi_custadd;
    
    @FindBy(how=How.XPATH,using="//input[@name='customer_mobile']")
    public static WebElement edi_custmobile;
    
    @FindBy(how=How.XPATH,using="//input[@name='customer_email']")
    public static WebElement edi_custemail;
    
    @FindBy(how=How.XPATH,using="//input[@name='customer_pwd']")
    public static WebElement edi_custpassword;
    
    @FindBy(how=How.XPATH,using="//input[@name='add_customer']")
    public static WebElement btn_custaddmem;
    
    
    
    
    public static void create_newstaff()
    {
    	lnk_addstaffmem1.click();
    	edi_staffname.sendKeys("mounica");
    	btn_gender.click();
    	edi_DOB.sendKeys("14/2/1995");
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	edi_relation.click();
    	edi_department.click();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	edi_DOJ.sendKeys("15/5/20015");
    	edi_address.sendKeys("jntu , hyderabad");
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	edi_mobile.sendKeys("8247468402");
    	edi_email.sendKeys("mounivallabhaneni8@gmail.com");
    	edi_password.sendKeys("pass1234");
    	btn_addmem.click();
    }
    
    public static void create_newcustomer()
    {
    	lnk_addcustomer.click();
    	edi_cutomername.sendKeys("krishna");
    	btn_cusgender.click();
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	edi_customernomini.sendKeys("nandhu");
    	edi_customerdob.sendKeys("19/6/1993");
    	edi_customerbranch.click();
    	edi_customreaccount.click();
    	edi_minamount.sendKeys("10000");
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	edi_custadd.sendKeys("jntu, hyderabad");
    	edi_custmobile.sendKeys("8247468402");
    	edi_custemail.sendKeys("balakrishnakakarla@gmail.com");
    	edi_custpassword.sendKeys("krish123");
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	btn_custaddmem.click();
    }

}
