package com.webElment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyJob {

private static WebElement element = null;
@SuppressWarnings("unused")
private static WebDriver driver;


public static WebElement MyJobs(WebDriver driver)
{
	element = driver.findElement(By.name("My Jobs")); // Add Job 
    return element;
}
	public static WebElement ListJOb(WebDriver driver)
	{
		element =  driver.findElement(By.id("com.prontoitlabs.hunter:id/tv_joblist_item_title")); // Add Job 
	    return  element;
	}
	
	public static WebElement indivisualJOb(WebDriver driver)
	{
		element =  driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_joblist_item_image")); // Add Job 
	    return  element;
	}
	
	public static WebElement editJOb(WebDriver driver)
	{
		element =  driver.findElement(By.name("Edit")); // Add Job 
	    return  element;
	}
	
	public static WebElement SelectIndustry(WebDriver driver)
	{
		element =  driver.findElement(By.id("com.prontoitlabs.hunter:id/spinner_add_jobs_industry")); // SelectIndustry 
	    return  element;
	}
	
	public void myJobsName()
	{
		
	}
}
