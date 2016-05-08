package com.tr.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	WebDriver driver;
	HomePage homePage = null;
	AddExtensionPage addExtensionPage = null;
	
	@BeforeTest
	
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	public void verifyHomePage() throws Exception{
		homePage = new HomePage(driver);
		boolean flag = homePage.isTextDisplayed();
		Assert.assertTrue(flag, "text is not displayed");
		addExtensionPage= homePage.clickLink();
	}
}
