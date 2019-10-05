package com.OHRM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.TestBase.TestBase;

public class EmployeePage extends TestBase {
	public EmployeePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//*[@id="employee-information"]/a
	//*[@id="content"]/comment()[1]
	@FindBy(xpath="//*[@id=\"employee-information\"]/a")
	WebElement EmployeeInfo;
	
	//*[@id="resultTable"]/tbody/tr[2]/td[1]
	//*[@id="resultTable"]/tbody/tr[2]/td[3]/a
	
	public boolean verifyEmployeeInfoLabel() {
		return EmployeeInfo.isDisplayed();
	}
	
	
	
	
}
