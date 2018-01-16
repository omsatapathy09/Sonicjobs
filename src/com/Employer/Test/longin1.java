package com.Employer.Test;

import com.Utility.*;
import com.webElment.SignIn;

import java.io.IOException;






import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class longin1 {
	WebDriver driver;
	
	String VisualText ="The Employer App. Login to find job seekers now.";
	

	@BeforeTest(alwaysRun = true)
	public void AppLunch() throws InterruptedException, IOException
	{
		setup st = new setup(null);
		st.AppLunch();
		
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
}
