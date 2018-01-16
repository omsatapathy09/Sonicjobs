package com.webElment;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPrefarence {

	private static WebElement element = null;
	private static PerformsTouchActions driver;
	
	public static WebElement searchPrefernceBTN(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_toolbar_addjobs")); // searchPrefernceBTN
	    return element;
	}
	
	public static WebElement selectVacany(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/tv_preferences_vacancy_select")); // selectVacany 
	    return element;
	}
	
	public static WebElement SelectDropdown(WebDriver driver)
	{
		element = driver.findElement(By.name("Kanpur 14thjan")); // selectVacany //  //
	    return element;
	}
	
	public static WebElement submit(WebDriver driver)
	{
		element = driver.findElement(By.name("Submit")); // selectVacany 
	    return element;
	}
	
	public static void SeekBarTest(){
		//WebElement slider =((WebElement) driver).findElement(By.id("com.prontoitlabs.hunter:id/rangebar_preferences_experience"));
		
		//Locating seekbar using resource id
		WebElement seek_bar=((WebElement) driver).findElement(By.id("com.prontoitlabs.hunter:id/rangebar_preferences_experience"));
		// get start co-ordinate of seekbar
		int start=seek_bar.getLocation().getX();
		//Get width of seekbar
		int end=seek_bar.getSize().getWidth();
		//get location of seekbar vertically
		int y=seek_bar.getLocation().getY();

		    // Select till which position you want to move the seekbar
		    TouchAction action=new TouchAction((MobileDriver) driver);
		    //Move it 40%
		    int moveTo=(int)(end*0.4);
		    action.press(start,y).moveTo(moveTo,y).release().perform();
		}
	public static WebElement SelLocation(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/spinner_preferences_location")); // selectVacany 
	    return element;
	}
	
	public static WebElement locationPUT(WebDriver driver)
	{
		element = driver.findElement(By.name("Start typing your location...")); // SAveBTN 
	    return element;
	}
	
	public static WebElement SAveBTN(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/fab_save_preferences")); // SaveBTN 
	    return element;
	}
}
