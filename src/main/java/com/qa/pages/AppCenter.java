package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class AppCenter extends BaseTest{
	
	@FindBy(linkText="Sign Out")
	WebElement signout;

	public AppCenter() {
		PageFactory.initElements(driver, this);
	}
	
	public void signOut() {
		signout.click();
	}

}
