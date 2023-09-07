package com.amazon.Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HomeWork 
{
	@BeforeTest
	public void StartApplication()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
	}
}
