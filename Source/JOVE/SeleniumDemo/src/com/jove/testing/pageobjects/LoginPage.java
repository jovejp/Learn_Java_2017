package com.jove.testing.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebElement;

import com.jove.testing.steps.CommonFunctions;

public class LoginPage {

	public static WebElement getUserName() {
		//return driver.findElement(By.xpath("//input[@id='username']")); 
		return CommonFunctions.driver.findElement(ById.id("username"));
	}
	
	
	public static WebElement getPWD() {
		return CommonFunctions.driver.findElement(By.xpath("//input[@id='password']")); 
	}
	
	public static WebElement getSubmit() {
		//return driver.findElement(By.xpath("//input[@id='Login']")); 
		return CommonFunctions.driver.findElement(ByName.name("Login"));
	}	
	
}
