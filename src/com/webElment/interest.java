package com.webElment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class interest {

	private static WebElement element = null;
	
	
	public static WebElement clickOnSearch(WebDriver driver)
	{
		element = driver.findElement(By.name("Search")); // searchPrefernceBTN
	    return element;
	}
	
	public static WebElement rightClick(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_home_interested")); // searchPrefernceBTN
	    return element;
	}
	
	public static WebElement invitePopup(WebDriver driver)
	{
		element = driver.findElement(By.name("INVITE TO CONNECT")); // searchPrefernceBTN
	    return element;
	}
	
	public static WebElement clickOnInvite(WebDriver driver)
	{
		element = driver.findElement(By.name("Invitations")); // Invitations
	    return element;
	}
	
	public static WebElement extendedcardName(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/tv_toolbar_proilfe_preview_seeker_name")); // Invitations
	    return element;
	}
	
	public static WebElement extendedcardName2(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/tv_jobsummary_title")); // Invitations
	    return element;
	}
	
	public static WebElement clickOnConnectNow(WebDriver driver)
	{
		element = driver.findElement(By.name("Connect Now")); // Invitations
	    return element;
	}
	
	public static WebElement connectionPopUp(WebDriver driver)
	{
		element = driver.findElement(By.name("Ok")); // Invitations
	    return element;
	}
	
	
}
