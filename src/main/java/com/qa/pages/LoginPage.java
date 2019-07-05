package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;
import com.qa.pages.AppCenter;

public class LoginPage extends BaseTest{

	//Object Repository using @FindBy Annotation (page factory annotation)
		@FindBy(id="loginEmail")
		WebElement username;
		
		@FindBy(id="loginPassword")
		WebElement password;
		
		@FindBy(id = "sbutton")
		WebElement submitButton;
		
		
	    //Initializing the page object 
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		public AppCenter login(String un, String pw) {
			username.sendKeys(un);
			password.sendKeys(pw);
			submitButton.click();
			return new AppCenter();
		}
}
