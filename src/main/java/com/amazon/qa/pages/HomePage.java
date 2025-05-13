package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Hello, Abhishek')]")
	WebElement usernameLabel;
	
	@FindBy(xpath="//a[@class='nav-a  ' and text()='Amazon Pay']")
	WebElement AmazonPay;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	public boolean validateLoginName()
	{
		return usernameLabel.isDisplayed();
	}
	
	public AmazonPayPage enterAmazonPay()
	{
		AmazonPay.click();
		return new AmazonPayPage();
	}
	
	 
	

}
