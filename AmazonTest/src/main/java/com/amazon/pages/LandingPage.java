package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage 
{
	Actions action;
	@FindBy(id = "nav-tools")
	private WebElement helloSignIn;
	
	@FindBy(linkText= "Sign in")
	private WebElement SignIn;
	
	@FindBy(linkText = "Mobiles")
	private WebElement ClickMobile;
	
	public LandingPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		
	}
	
	public void hoverOnPointer() 
	{
		action.moveToElement(helloSignIn).build().perform();
		
	}
	public void ClickOnSignIn() throws InterruptedException
	{
		Thread.sleep(3000);
		SignIn.click();
		
	}
	public void clickOnMobile() 
	{
		ClickMobile.click();
	}
}

