package com.jove.testing.steps;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jove.testing.model.CommonData;
import com.jove.testing.pageobjects.HomePage;
import com.jove.testing.pageobjects.LoginPage;

public class CommonFunctions {
	//webdiver
	public static WebDriver driver;
    
	//init
	@SuppressWarnings("finally")
	public static boolean init(CommonData data) {
		boolean result = true;
    	try {
    		if (data.browser.equals("Chrome")) {
    			driver = new ChromeDriver();
    		} else {
    			
    		}
    		driver.get("https://ap2.salesforce.com/");
    	}catch(Exception e){
    		result = false;
    	} finally {
    		return result;    		
    	}		
	}
	
	//login
    @SuppressWarnings("finally")
	public static boolean login(CommonData data) {
    	boolean result = true;
    	try {
    	    LoginPage.getUserName().sendKeys(data.userName);
    	    LoginPage.getPWD().sendKeys(data.passwd);
    	    LoginPage.getSubmit().click();
    	    HomePage.getTitle();
    	    if (!HomePage.getTitle().contains("Force.com")) {
    	    	result = false;
    	    }
    	    System.out.println(HomePage.getTitle());
    	}catch(Exception e){
    		System.out.println(e.getMessage());
    		result = false;
    	} finally {
    		return result;    		
    	}
    }


}
