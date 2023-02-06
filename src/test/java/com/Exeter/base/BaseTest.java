package com.Exeter.base;


import java.util.Properties;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.asserts.SoftAssert;

import com.Exeter.factory.DriverFactory;
import com.Exeter.pages.PrivacyPolicy;



public class BaseTest {

	DriverFactory df;

	

	protected SoftAssert softAssert;
	protected Properties prop;
    public static WebDriver driver = null;
    public WebDriverWait wait;
    
	@BeforeTest
	
     public void BaseSetup() throws InterruptedException {
		String BrowserDriverPath= "C:\\Users\\manal\\OneDrive\\Desktop\\SeleniumWebdriver\\chromedriver_win32109\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",BrowserDriverPath);
		driver = new ChromeDriver(); 
		  String url = "https://m.exeter.ac.uk/";
        driver.get(url);
        driver.manage().window().maximize();
    	Thread.sleep(5000);
    
	}
	public void writeText(By elementlocation, String text) {
	    driver.findElement(elementlocation).sendKeys(text);
	}



}
