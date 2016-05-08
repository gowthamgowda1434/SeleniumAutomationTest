package com.tr.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class HandlingAlerts {
	//Alert alert;
	public static void main(String args[]) throws InterruptedException{
	String expMsg = "Please share this website with your friends and in your organization.";


		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement alertWin = driver.findElement(By.id("alert"));
		alertWin.click();
		Thread.sleep(3000);
		Alert alert =driver.switchTo().alert();
		String actMsg = alert.getText();
		System.out.println(actMsg);
		//Thread.sleep(3000);
		Assert.assertEquals("exp is not matching ", expMsg, actMsg);
		
		driver.switchTo().alert().accept();

}

}