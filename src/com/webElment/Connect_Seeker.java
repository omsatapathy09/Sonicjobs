package com.webElment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Connect_Seeker {
	
private static WebElement element = null;
	
	public static WebElement connctClick(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_home_interested")); 
	    return element;
	}
	
	public static WebElement InvitePopUp(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/tv_positive")); 
	    return element;
	}
	
	public static WebElement MenuBTN(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/openMenu")); 
	    return element;
	}
	
	public static WebElement connectionBTN(WebDriver driver)
	{
		element = driver.findElement(By.name("Connections")); 
	    return element;
	}
	
	public static WebElement connectionCNT(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/badge")); 
	    return element;
	}
	
	//  Chat session 
	
	public static WebElement ChatBTN(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_interests_seeker_chat")); 
	    return element;
	}
	

}
