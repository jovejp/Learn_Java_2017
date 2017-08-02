package com.jove.testing.pageobjects;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jove.testing.steps.CommonFunctions;

public class HomePage {
	
	public static String getTitle(){
		WebDriverWait wait = new WebDriverWait(CommonFunctions.driver, 10);
		wait.until(ExpectedConditions.titleContains("Force.com"));
		return CommonFunctions.driver.getTitle();		
	}
	
	

}
