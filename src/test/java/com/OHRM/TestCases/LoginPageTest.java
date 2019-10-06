package com.OHRM.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.OHRM.Pages.HomePage;
import com.OHRM.Pages.LoginPage;
import com.OHRM.TestBase.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest() throws IOException {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws IOException {
		
		intialization();
		loginPage=new LoginPage();
		
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		
		String Title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(Title, "OrangeHRM");
		
	}
	
	@Test(priority=2)
	public void validateLogoTest() {
		
		Boolean flag=loginPage.validateLogoOHRM();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void LoginTest() throws IOException {
		
		homePage=loginPage.login(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
}
