package com.amazon.Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.LandingPage;
import com.amazon.pages.SignIn;

public class BaseStartApp 
{
WebDriver driver;
	
	@BeforeTest
	public void StartApplication()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.amazon.in/");
	}
	@AfterTest
	public void CloseApp()
	{
//		driver.close();
		
	}
}
