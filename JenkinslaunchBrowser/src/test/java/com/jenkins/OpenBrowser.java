package com.jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

	
	@Test
	public void LaunchBrowser() {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://flipkart.com");
	String title=driver.getTitle();
	System.out.println("The Title of the page is==>"+title);
	driver.close();
	
		
	}
}
