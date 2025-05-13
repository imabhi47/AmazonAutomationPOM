package com.amazon.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	//will define annotations and everything
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage=new LoginPage();
	}
	
	/*
	 * @Test(priority=2) public void loginPageTitleTest() { String
	 * title=loginPage.validateLoginPageTitle(); Assert.assertEquals(title,
	 * "Amazon.in"); }
	 * 
	 * @Test(priority=3) public void amazonLogoTest() {
	 * homePage=loginPage.login(prop.getProperty("username"),
	 * prop.getProperty("password")); boolean flag=loginPage.validateAmazonLogo();
	 * Assert.assertTrue(flag); }
	 */
	
	@Test(priority=1)
	public void loginTest()
	{
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

	
}
