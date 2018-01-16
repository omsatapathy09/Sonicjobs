package com.webElment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	private static WebElement element = null;
	
	public static WebElement FBSignin(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/btn_fb_login")); 
	    return element;
	}
	
	public static WebElement textCompare(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/tv_login_message")); 
	    return element;
	}
	
	public static WebElement popUPsaveAccount(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/btn_allow")); 
	    return element;
	}
	
	public static WebElement CusSignin(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/btn_login_signup")); 
	    return element;
	}
	
	public static WebElement UserN(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/et_email")); // UserName
	    return element;
	}
	
	public static WebElement PassWod(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/et_password")); // pwd 
	    return element;
	}
	
	public static WebElement LogInBtn(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/btn_login")); 
	    return element;
	}
	
	public static WebElement OkBtn2(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/btn_allow"));  // allow po
	    return element;
	}
	
	
	
}
