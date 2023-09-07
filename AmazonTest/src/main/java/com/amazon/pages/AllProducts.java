package com.amazon.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AllProducts 
{
	@FindBy(linkText ="Laptops & Accessories")
	private WebElement ClickonLaptopAndAccessories;
	
	public AllProducts(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	public void HoverOnLaptopAndAccessories();
	
	}
