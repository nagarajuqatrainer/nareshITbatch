package com.narshProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import baseClass.baseClass;
import loginPageObjects.loginPage;

public class loginTestCase extends baseClass {
  
	public static WebDriver driver;
	
	
	@Test
  public void launchBrowser() throws Exception {
	  
		WebDriver driver = BrowserFactory.getBrowser(config1.getChromeBrowser(), config1.getAppUrl());
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		
		login.verifyLoginPage(config1.getUserName(), config1.getPassword());
		login.verifyButton();
		browser.quitBrowser();
  }
}
