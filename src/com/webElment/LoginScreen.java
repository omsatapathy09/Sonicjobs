package com.webElment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScreen {

	private static WebElement element = null;
	
	
	public static WebElement FBlogin(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/btn_fb_login")); // searchPrefernceBTN
	    return element;
	}
}
