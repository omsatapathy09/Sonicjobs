package com.Employer.Test;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webElment.AddJob;
import com.webElment.Chat;
import com.webElment.Connect_Seeker;
import com.webElment.MyApplication;
import com.webElment.SearchPrefarence;
import com.webElment.SignIn;
import com.webElment.interest;

public class Login_Employer {
	
	WebDriver driver;
	Dimension size;
	
	Properties prop;
	String VisualText ="The Employer App. Login to find job seekers now.";
	
	String addJobname ="2nd july";
	
	String topJob;
	String topApplication;
	
	String chatMsg ="hi u need what type of job";
	String seekerName;
	
	public void waitTime(){
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
	
	@SuppressWarnings("rawtypes")
	@BeforeTest(alwaysRun = true)
	public void AppLunch() throws InterruptedException, IOException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "HC5BAYGE1062"); // ENU7N16120000517 //HC5BAYGE1062 //4d008037cc22825d
		capabilities.setCapability("platformVersion", "5.0.2"); // 6.0.1  // 5.0.2 //5.0.0
		capabilities.setCapability("platformName", "Android");
				
	  	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  	
	  	Thread.sleep(8000);	  	
	}
	
	@Test(priority=1,dependsOnMethods="AppLunch")
	public void LandingPage()
	{
		try{
			if(driver != null)
			{
			SignIn.textCompare(driver).equals(VisualText);
			System.out.println(VisualText);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	 
	@Test(priority=2)
	public void  loginFB()
	{
		try
		{
			// Application lunch by Facebook
			SignIn.FBSignin(driver).click();
		  	System.out.println("fb login sucessfully !");
		  	Thread.sleep(16000);
		  	
		   	WebDriverWait wait = new WebDriverWait(driver, 10);
		   	WebElement notiPop = wait.until(ExpectedConditions.elementToBeClickable(SignIn.popUPsaveAccount(driver)));
		   	notiPop.click();
		   	
		   	Thread.sleep(5000);
		   	
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public void addJob() throws InterruptedException
	{
		try{
			Connect_Seeker.MenuBTN(driver).click();   // Menu Button
			waitTime();
		  	
			AddJob.addjobBTN(driver).click();
			waitTime();
			AddJob.SelIndustry(driver).click();
			waitTime();
			AddJob.RadioButton(driver).click();
			AddJob.JobTitle(driver).sendKeys(addJobname);
			waitTime();	
			
			AddJob.OKBTN(driver).click();
			Thread.sleep(4000);
			
			AddJob.ProcessAny(driver).click();
			waitTime();
			
			AddJob.saveButton(driver).click();
			Thread.sleep(3000);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	@Test(priority=4)
	public void myJob() throws InterruptedException
	{  	
	    topJob =	SearchPrefarence.selectVacany(driver).getText();
	   
	   if(addJobname.equalsIgnoreCase(topJob))
	   {
		    SearchPrefarence.SAveBTN(driver).click();
		    Thread.sleep(4000);
	   }
	   
	   else{
		   System.out.println("invalid job created");
	   }  
	}
	
	
	@Test(priority=5)
	public void showInterest()
	{
		if(driver != null){
			
			MyApplication.HamburgurIcon(driver).click();	
			try {
				 interest.clickOnSearch(driver).click();
				 Thread.sleep(1500);
				 
				 interest.rightClick(driver).click();
				 interest.invitePopup(driver).click();
				 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

	
	@Test(priority=6)
	public void invitations() throws InterruptedException
	{
       if(driver != null)
       {
			MyApplication.HamburgurIcon(driver).click();
			interest.clickOnInvite(driver).click();
			
		   seekerName= MyApplication.application_SeekerName(driver).getText();
		   MyApplication.clickOnSeekerDetail(driver).click();
		
		if(seekerName.equalsIgnoreCase(interest.extendedcardName(driver).getText()))
		{

		 if(interest.clickOnConnectNow(driver).isDisplayed())
			{
				interest.clickOnConnectNow(driver).click();
				interest.connectionPopUp(driver).click();
				
				Chat.ChatText(driver).sendKeys(chatMsg);
				Chat.SendBTN(driver).click();
				Thread.sleep(1500);
				driver.navigate().back();
				
				Chat.BckBTN(driver).click();
				
			}
		  }
		
       }
	}
	
	
	
}
