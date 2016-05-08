package com.tr.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	boolean flag = false;
	String text = null;
	WebElement element = null;
	String homePageTitle = "Selenium";
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	By txt = By.xpath("//h2[contains(.,'Practice Form Controls')]");
	By link = By.linkText("Add Extensions");

	public boolean isTextDisplayed() throws Exception{
		try {
			flag = driver.findElement(txt).isDisplayed();
			if (flag) {System.out.println("text is displayed");
				
			} else {System.out.println("text is not displayed");

			}
			
		} catch (Exception e) {
			throw new Exception("Failed in verifying text present in home page::"+isTextDisplayed()+e.getLocalizedMessage());
		}
		return flag;
	}

	public AddExtensionPage clickLink(){
		try {
			element = driver.findElement(link);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "add extension link is not displayed");
			element.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {
			
			
		}
		return new AddExtensionPage(driver);
		
	}
	
}
