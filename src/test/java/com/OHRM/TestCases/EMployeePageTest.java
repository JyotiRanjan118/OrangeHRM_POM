package com.OHRM.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OHRM.Pages.AddEmployeePage;
import com.OHRM.Pages.AdminPage;
import com.OHRM.Pages.CandidatePage;
import com.OHRM.Pages.EmployeePage;
import com.OHRM.Pages.HomePage;
import com.OHRM.Pages.LoginPage;
import com.OHRM.TestBase.TestBase;

public class EMployeePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	EmployeePage employeepage;
	public EMployeePageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		intialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		employeepage=new EmployeePage();
		homePage=loginPage.login(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		employeepage=homePage.EmployeePageClick();
	}
	
	@Test
	public void verifyEmployeeInfoLabelTest() {
		employeepage.verifyEmployeeInfoLabel();
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
