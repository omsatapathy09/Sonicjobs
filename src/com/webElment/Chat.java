package com.webElment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Chat {

	private static WebElement element = null;
	
	public static WebElement ApplicationTxt(WebDriver driver)
	{
		element = driver.findElement(By.name("Applications")); // ApplicationSekName
		return element;
	}
	
	public static WebElement ChatButton(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_interests_seeker_chat")); // ApplicationSekName
		return element;
	}

	public static WebElement ChatText(WebDriver driver)
	{
		element = driver.findElement(By.name("Enter Text...")); // ApplicationSekName
		return element;
	}
	
	public static WebElement SendBTN(WebDriver driver)
	{
		element = driver.findElement(By.name("SEND")); // ApplicationSekName
		return element;
	}
	
	public static WebElement BckBTN(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_toolbar_chat_back")); // ApplicationSekName
		return element;
	}
}
