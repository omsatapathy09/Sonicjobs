package com.webElment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddJob {

private static WebElement element = null;
	
	public static WebElement addjobBTN(WebDriver driver)
	{
		element = driver.findElement(By.name("Add Job")); // Add Job 
	    return element;
	}
	
	public static WebElement SelIndustry(WebDriver driver)
	{
		element = driver.findElement(By.name("Select Industry")); // select Industry
	    return element;
	}
	
	public static WebElement RadioButton(WebDriver driver)
	{
		element = driver.findElement(By.name("Restaurants and Cafés")); // select RadioButton
	    return element;
	}
	
	public static WebElement JobTitle(WebDriver driver)
	{
		element = driver.findElement(By.name("Type Job Title")); // JobTitle
	    return element;
	}
	
	public static WebElement OKBTN(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/fab_add_jobs")); // JobTitle
	    return element;
	}
	
	public static WebElement ProcessAny(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/btn_proceed_now")); // UploadNw
	    return element;
	}
	
	public static WebElement FromGallaery(WebDriver driver)
	{
		element = driver.findElement(By.name("Gallery")); // UploadNw
	    return element;
	}
	
	public static WebElement FromCamera(WebDriver driver)
	{
		element = driver.findElement(By.name("4 items")); // UploadNw
	    return element;
	}
	
	public static WebElement saveButton(WebDriver driver)
	{
		element = driver.findElement(By.name("Save")); // saveButton
	    return element;
	}
	
}
