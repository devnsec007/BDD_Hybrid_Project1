package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AjaxFormPage;
import com.qa.pages.HomePage;

public class TestBaseClass {

	
	String BaseURL = "https://www.seleniumeasy.com/test/";
	public WebDriver driver;
	
	
	
	
	
	
		//constructor for base class
	public TestBaseClass() {
			
	}
	
		//Initialization method	
	public WebDriver initialization() {
		
		
		
		System.setProperty("webdriver.chrome.driver","F:\\eclipse-workspace\\HybridBDDProject\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get(BaseURL);
		
		//Handling the Add thats appearing
		if(driver.findElement(By.xpath("//div[@class='at4win-header']/a")).isEnabled())
			driver.findElement(By.xpath("//div[@class='at4win-header']/a")).click();
		
		return driver;
	}
	
	
	
	
	
	
}
