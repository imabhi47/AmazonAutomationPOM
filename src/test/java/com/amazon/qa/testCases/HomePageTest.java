package com.amazon.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homepage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage=new LoginPage();  //need to create LoginPage Object so that we can access LoginPage class methods
		homepage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyUserNameTest()
	{
		boolean flag=homepage.validateLoginName();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
