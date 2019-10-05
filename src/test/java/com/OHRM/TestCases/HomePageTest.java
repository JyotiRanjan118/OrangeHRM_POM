package com.OHRM.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	AdminPage adminpage;
	EmployeePage employeepage;
	AddEmployeePage addemployeePage;
	CandidatePage candidatepage;
	public HomePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		intialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		employeepage=new EmployeePage();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		homePage=loginPage.login(prop.getProperty("UserName"), prop.getProperty("PassWord"));
		
	}
	
	@Test(priority=1,enabled=true)
	public void verifyUserNameTest() {
		boolean userName=homePage.verifyCorrectUserName();
		Assert.assertTrue(userName);
		
		
	}
	
	@Test(priority=2,enabled=true)
	public void AdminPageTest() {
		adminpage=homePage.ClickOnAdminLink();
		
	}
	
	@Test(priority=3,enabled=true)
	public void addEmployeePageTest() throws IOException {
		addemployeePage=homePage.addEmployeeClick();
		
	}
	
	@Test(priority=4,enabled=true)
	public void CandidatePageTest() throws IOException {
		candidatepage=homePage.addCandidateClick();
		boolean candidatesearch=candidatepage.verifysearchcandidatePage();
		Assert.assertTrue(candidatesearch);
	}
	
	@Test(priority=5)
	public void EmployeePageTest() throws IOException, InterruptedException {
		employeepage=homePage.EmployeePageClick();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
