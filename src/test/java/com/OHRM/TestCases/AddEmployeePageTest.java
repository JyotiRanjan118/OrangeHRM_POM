package com.OHRM.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.OHRM.Pages.HomePage;
import com.OHRM.Pages.LoginPage;
import com.OHRM.TestBase.TestBase;

public class AddEmployeePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	public AddEmployeePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		intialization();
		loginpage=new LoginPage();
		homePage=new HomePage();
		
	}

}
