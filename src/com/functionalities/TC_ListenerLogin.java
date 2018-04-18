package com.functionalities;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.functionalities.TestngListeners.class)

public class TC_ListenerLogin extends CommonFuntionalities
{
	@Test
	public void TC01_LoginFields()
	{
	    driver.get("http://server/bank/");
		ListenersLogin lis_log = PageFactory.initElements(driver, ListenersLogin.class);
		lis_log.verify_Fields();
	}

}
