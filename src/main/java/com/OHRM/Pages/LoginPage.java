package com.OHRM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.TestBase.TestBase;

public class LoginPage extends TestBase {
	//Initializing page Object
	public LoginPage() throws IOException {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="txtUsername")
	WebElement UserName;
	
	@FindBy(id="txtPassword")
	WebElement PassWord;
	
	@FindBy(id="btnLogin")
	WebElement Login;
	
	@FindBy(xpath="//img[@src='/webres_5d6f937c9c7169.68307390/themes/default/images/login/logo.png']")
	WebElement OHRMLogo;
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogoOHRM() {
		return OHRMLogo.isDisplayed();
	}
	
	
	public HomePage login(String un,String pwd) throws IOException {
		UserName.sendKeys(un);
		PassWord.sendKeys(pwd);
		Login.click();
		
		return new HomePage();
	}
	
	
	
	
	
	
	

}
