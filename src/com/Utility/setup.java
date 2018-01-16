package com.Utility;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class setup {
	WebDriver driver;
	
	public setup(WebDriver dr) {
	
		this.driver =dr;
	}
	
	@SuppressWarnings("rawtypes")
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

}
