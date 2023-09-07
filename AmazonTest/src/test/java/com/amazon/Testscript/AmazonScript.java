package com.amazon.Testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.LandingPage;
import com.amazon.pages.SignIn;

import org.testng.annotations.BeforeTest;

public class AmazonScript extends BaseStartApp
{
	
	
	@Test
	public void Hover() throws InterruptedException
	{
	LandingPage landingPage = new LandingPage(driver);
	landingPage.hoverOnPointer();
	
	landingPage.ClickOnSignIn();
	SignIn sign = new SignIn(driver);
	
	sign.fillingIntoBox("jfsadjfljs@gmail.com");
	sign.clickingOnBtn();	
	}
}
