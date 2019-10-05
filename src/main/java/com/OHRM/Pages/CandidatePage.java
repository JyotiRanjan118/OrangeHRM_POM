package com.OHRM.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OHRM.TestBase.TestBase;

public class CandidatePage extends TestBase {

	public CandidatePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="srchCandidates")
	WebElement searchCandidate;
	
	public boolean verifysearchcandidatePage() {
		return searchCandidate.isDisplayed();
	}
}
