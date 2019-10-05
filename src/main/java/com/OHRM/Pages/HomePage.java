package com.OHRM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.TestBase.TestBase;

public class HomePage extends TestBase{

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement AdminLink;
	
	@FindBy(id="welcome")
	WebElement HomePageValidationText;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimModule;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmployee;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement viewrecruitment;
	
	@FindBy(id="menu_recruitment_viewCandidates")
	WebElement viewcandidate;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement EmployeeList;
	
	public boolean verifyCorrectUserName() {
		return HomePageValidationText.isDisplayed();
	}
	
	public AdminPage ClickOnAdminLink() {
		AdminLink.click();
		return new AdminPage();
	}
	
	public AddEmployeePage addEmployeeClick() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(pimModule).perform();
		addEmployee.click();
		return new AddEmployeePage();
		
	}
	
	public CandidatePage addCandidateClick() throws IOException {
		Actions act=new Actions(driver);
		act.moveToElement(viewrecruitment).perform();
		viewcandidate.click();
		return new CandidatePage();
		
	}
	
	public EmployeePage EmployeePageClick() throws IOException, InterruptedException {
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(pimModule).perform();
		Thread.sleep(3000);
		EmployeeList.click();
		return new EmployeePage();
	}
	
	
	
}
