package com.webElment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Connection {

	private static WebElement element = null;
	
	public static WebElement ConnectionsTit(WebDriver driver)
	{
		element = driver.findElement(By.name("Connections")); // ConnectionsTit
		return element;
	}
}
