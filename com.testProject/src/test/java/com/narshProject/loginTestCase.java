package com.narshProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import loginPageObjects.loginPage;

public class loginTestCase  {
  
	public static WebDriver driver;
	public configReader config1;
	public BrowserFactory browser;
	

	@BeforeTest
	public void setUpSuite() {
		
		config1=new configReader();
		browser=new BrowserFactory();
		
	}
	
	@Test
  public void launchBrowser() throws Exception {
	  
		WebDriver driver = BrowserFactory.getBrowser(config1.getChromeBrowser(), config1.getAppUrl());
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		
		login.verifyLoginPage(config1.getUserName(), config1.getPassword());
		login.verifyButton();
		browser.quitBrowser();
  }
}
