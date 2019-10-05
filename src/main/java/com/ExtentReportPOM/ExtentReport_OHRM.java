package com.ExtentReportPOM;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport_OHRM {
	public ExtentReport_OHRM() {
		// TODO Auto-generated constructor stub
	}
	static ExtentHtmlReporter htmlreporter;
	static ExtentReports reports;
	static ExtentTest test;
	
	public static void setUPExtent() {
		htmlreporter=new ExtentHtmlReporter(".\\reports\\OrangeHRM.html");
		htmlreporter.config().setDocumentTitle("OHRM");
		htmlreporter.config().setReportName("OHRM_Login");
		htmlreporter.config().setTheme(Theme.DARK);
		
		reports=new ExtentReports();
		reports.attachReporter(htmlreporter);
		
		reports.setSystemInfo("HostName", "LocalHost");
		reports.setSystemInfo("OS", "windows 8.1");
		reports.setSystemInfo("TesterName", "JYOTI");
		reports.setSystemInfo("Browser", "chrome");
		
	}
	
	public static void test(String testName) {
		test=reports.createTest(testName);
		
	}
	
	public void tearDown(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FATAL,"Test case failed "+result.getName());
			test.log(Status.FATAL, "Test case failed "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "Test case failed "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test case passed "+result.getName());
		}
	}
	
	
	public static void endreport() {
		reports.flush();
	}
}
