package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends com.amazon.qa.base.TestBase
{
	
	//need to define 2 things here i.e. objectRepository(PageFactory)
	
	@FindBy(xpath="//div[@id='nav-link-accountList']")
	WebElement signIn;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement continueButton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//a[@aria-label='Amazon.in']")
	WebElement amazonLogo;
	
	//now we have to initialize all the above object repositories.
	
	//how to initialize the element with the help of PageFactory(Create a Constructor)
	public LoginPage()
	{
		PageFactory.initElements(driver, this);    // with the help of initElements(); this means current class object
	}
	
	//Actions:(means diff features)
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateAmazonLogo()
	{
		return amazonLogo.isDisplayed();
	}
	
	public HomePage login(String us, String pwd)
	{
		signIn.click();
		email.sendKeys(us);
		continueButton.click();
		password.sendKeys(pwd);
		submit.click();
		return new HomePage();
	}

}
