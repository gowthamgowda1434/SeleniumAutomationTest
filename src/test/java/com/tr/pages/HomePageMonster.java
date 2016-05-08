package com.tr.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePageMonster {

	WebDriver driver;
	boolean flag = false;
	String text = null;
	WebElement element;
	
	public HomePageMonster(WebDriver driver){
		this.driver = driver;
	}
	
	By siteLogo = By.xpath("//div/a[@class='lft mn-logo']");
	By txt = By.xpath("//div[@class='rbtntxt']");
	By upLoadResume = By.linkText("Upload Resume");
	
	public boolean logoIsDisplayed(){
		
		flag = driver.findElement(siteLogo).isDisplayed();
		if (flag) { System.out.println("site logo is displayed");
			
		} else { System.out.println("site logo is not displayed");

		}
		return flag;
		
		}
	public boolean textIsDisplayed(){
		element = driver.findElement(txt);
		flag = element.isDisplayed();
		
		if (flag) { System.out.println("text is displayed");
			
		} else { System.out.println("text is not displayed");

		}
		return flag;
	}
	
	public CreateAccountMonsterPage clickUploadResume(){
		
		element = driver.findElement(upLoadResume);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "the resume upload is not displayed");
		element.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new CreateAccountMonsterPage(driver);
		}
}
