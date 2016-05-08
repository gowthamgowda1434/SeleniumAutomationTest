package com.tr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AviatorSelectPage {
	
	WebDriver driver;
	WebElement element;
	boolean flag = false;
	public AviatorSelectPage(WebDriver driver){
		this.driver = driver;
	}
	By aviatorText = By.xpath("//div[@class='reg_headbig']");
	By aviatorSelectorExpeience = By.id("id='Just_in_Job");
	By saveAndContinue = By.id("avatr_sel");
	
	public boolean verifyAviatorSelectTest(){
		element = driver.findElement(aviatorText);
		flag=	element.isDisplayed();
		
		if (flag) { System.out.println("aviator select text is present");
			
		} else { System.out.println("aviator select text is not present");

		}
		String text = element.getText();
		System.out.println(text);
		return flag;
		}
	
		public AviatorSelectPage clickSaveAndContinue(){
			element = driver.findElement(saveAndContinue);
			element.click();
			return this;
		}
		
	
	

}
