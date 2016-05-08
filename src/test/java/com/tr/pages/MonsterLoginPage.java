package com.tr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MonsterLoginPage {
	
	WebDriver driver;
	WebElement element;
	boolean flag = false;
	String text = null;
	
	public MonsterLoginPage(WebDriver driver){
		this.driver = driver;
		}
	
	By logInField = By.id("username_login");
	 
	public MonsterLoginPage verifyLoginField(){
		
		element = driver.findElement(logInField);
		flag = element.isDisplayed();
		if (flag) { System.out.println("login field is displayed");
			
		} else { System.out.println("login field is not displayed");

		}
		text = element.getAttribute("value");
		System.out.println("the login field value is::"+text);
		return this;
	}

}
