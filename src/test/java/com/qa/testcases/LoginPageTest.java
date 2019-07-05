package com.qa.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qa.pages.AppCenter;
import com.qa.pages.LoginPage;
import com.qa.utils.CustomListner;
import com.qa.base.BaseTest;

@Listeners(CustomListner.class)
public class LoginPageTest extends BaseTest{
	
	LoginPage loginpage;
	AppCenter appcenterpage;

	public Logger log = Logger.getLogger(LoginPageTest.class);

	public LoginPageTest() {
		super();	
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		loginpage = new LoginPage();
		//log.info(">>>>>>Initilization of browser");
		System.out.println(">>>>> branch testing ");
	}
	
	@Test(priority=1)
	public void loginTest() {
		appcenterpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		//log.info(">>>>> In Application Center");
		//Assert.assertEquals("Test", driver.getTitle());
		
	}
	
	@AfterMethod
	public void tearsDown() {
		driver.quit();
	}


}
