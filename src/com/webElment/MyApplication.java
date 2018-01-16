package com.webElment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyApplication {

	public MyApplication() {
		super();
	}

List<WebElement> lit;

@SuppressWarnings("static-access")
public MyApplication(WebDriver dr)
{
	this.driver=dr;
}

private static WebElement element = null;
public static	WebDriver driver;




public static WebElement HamburgurIcon(WebDriver driver)
{
    element = driver.findElement(By.id("com.prontoitlabs.hunter:id/openMenu")); // ApplicationSekName
    return element;
}

   public static WebElement ApplicationLink(WebDriver driver)
    {
	    element = driver.findElement(By.name("Applications")); // ApplicationSekName
        return element;
    }
   public static WebElement motiviPop1Til(WebDriver driver)
   {
	    element = driver.findElement(By.id("com.prontoitlabs.hunter:id/main_content")); // Motivational score
       return element;
   }
   
   public static WebElement motiviPop1BTN(WebDriver driver)
   {
	    element = driver.findElement(By.name("Next")); // Next
       return element;
   }
   
   public static WebElement OkGotIt(WebDriver driver)
   {
	    element = driver.findElement(By.name("OK, Got it")); // OkGotIt
       return element;
   }
   
   public static WebElement motiviPop2Til(WebDriver driver)
   {
	    element = driver.findElement(By.name("Accept & Chat")); // Accept & Chat
       return element;
   }
   public static WebElement motiviPop3BTN(WebDriver driver)
   {
	    element = driver.findElement(By.name("Filter")); // Filter
       return element;
   }
   
   public static WebElement applicationTil(WebDriver driver)
   {
	    element = driver.findElement(By.name("Applications")); // Applications title
       return element;
   }
   
   public static WebElement filterBTN(WebDriver driver)
   {
	    element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_toolbar_addjobs")); // Filter
       return element;
   }
   
   public static WebElement application_SeekerName(WebDriver driver)
   {
	    element = driver.findElement(By.id("com.prontoitlabs.hunter:id/tv_interests_seeker_name")); // Filter
       return element;
   }
   
	public static WebElement ApplicationSekName(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/tv_interests_seeker_job_name")); // ApplicationSekName
	    return element;
	}
	
	public static WebElement scoreMarkTop(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/meter_percent")); // socreOn Top
	    return element;
	}
	
	
	public static WebElement scoreMarkinside(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/score_percent")); // insideScore
	    return element;
	}
	
	public static WebElement acceptAndChat(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/acceptchat_text")); // insideScore
	    return element;
	}
	
	public static WebElement backBtn(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_toolbar_preview_back")); // backBtn
	    return element;
	}
	public static WebElement ChatBTN(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_interests_seeker_chat")); // ChatBTN
	    return element;
	}
	
	public static WebElement ChatText(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/main_content")); // ChatText
	    return element;
	}
	
	public static WebElement ChatOkBTN(WebDriver driver)
	{
		element = driver.findElement(By.name("Ok")); // ChatText
	    return element;
	}
	
	// Apply  Filter

	public static WebElement FilterBTN(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_toolbar_addjobs")); // FilterBTN
	    return element;
	}
	
	public static WebElement vacancyTopName(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/tv_filter_vacancy_select")); // FilterBTN
	    return element;
	}
	
	
	
	public static WebElement clickOnSeekerDetail(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/iv_interests_seeker")); // FilterBTN
	    return element;
	}
	
	
	public static WebElement closeFilter(WebDriver driver)
	{
		element = driver.findElement(By.id("com.prontoitlabs.hunter:id/close_filter")); // closeFilter btn
	    return element;
	}
	
	
	public void listApplication()
	{
		List<WebElement> lit = driver.findElements(By.id("com.prontoitlabs.hunter:id/tv_interests_seeker_name"));
				              lit.size();
			    String name =  lit.get(0).getText();
			    System.out.println(name);
				
	}
	
}
