package com.qa.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.BaseTest;

public class Utility extends BaseTest{
	
	public Utility() throws IOException {
		super();
	}
	
	
	public void takeScreenshot() {
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File("C:/Users/Murali Arjun/Documents/SeleniumOverview/"
						+ "screenshots/" + System.currentTimeMillis() + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	}


}
