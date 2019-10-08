package com.OHRM.TestBase;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		
		FileInputStream file=new FileInputStream(".\\resources\\config.properties");
		prop=new Properties();
		prop.load(file);
		
		
	}
	
	public static void intialization() {
		String browserName=prop.getProperty("Browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\driverFiles\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", ".\\driverFiles\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get(prop.getProperty("URL"));
	}
}
