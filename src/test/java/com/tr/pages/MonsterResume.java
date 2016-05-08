package com.tr.pages;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MonsterResume {
	
	public static void main(String args[]){
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		driver.get("http://my.monsterindia.com/create_account.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
WebElement ele = driver.findElement(By.id("select2-chosen-1"));
ele.click();
WebElement send = driver.findElement(By.id("s2id_autogen1_search"));
send.sendKeys("Bengaluru / Bangalore");
send.sendKeys(Keys.ENTER);
	}
}
