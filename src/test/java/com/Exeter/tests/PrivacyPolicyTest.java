package com.Exeter.tests;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Exeter.base.BaseTest;
import com.Exeter.pages.PrivacyPolicy;
import com.Exeter.utils.AppConstants;
import com.Exeter.utils.AppErrors;
import com.Exeter.utils.TimeUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Epic("Epic - 100: Design booking hotel application")
@Story("US - 101: Create booking functionality ")


public class PrivacyPolicyTest extends BaseTest {
	
	@Description("Testcase with default priorty for launching the browser")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = -1)
	public void LaunchedSetup()
	{
	
		TimeUtil.mediumWait();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        WebElement Privatepolicy =  (WebElement) jse.executeScript("return document.querySelector('flt-glass-pane').shadowRoot.querySelector('flt-scene-host>flt-scene>flt-canvas-container>canvas')");
        
        System.out.println("a:"+  Privatepolicy.getLocation());
        System.out.println("a:"+ Privatepolicy.getClass());
   
        
      
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Privatepolicy);
       
       
        
	}

}


