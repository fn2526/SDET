package com.amazon.Testscript;

import org.testng.annotations.Test;

import com.amazon.pages.LandingPage;

public class BuyMobileiPhone extends BaseStartApp
{
	@Test
	
	public void BuyMobileiPone() throws InterruptedException
	{
		LandingPage mobile = new LandingPage(driver);
		mobile.clickOnMobile();
	}
}
