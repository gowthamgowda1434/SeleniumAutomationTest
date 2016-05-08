package com.tr.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstSeleniumWithMavenTest {

	WebDriver driver;
	String URL = "http://www.seleniumframework.com/Practiceform/";
	
@BeforeTest

public void setUp(){
	
	driver = new FirefoxDriver();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

@Test

public void Test(){
java.util.List<WebElement> we =  driver.findElements(By.xpath("//div[@class = 'form-fields']/span/input"));
	
	int sz =we.size();
	System.out.println("total number of text boxes::"+sz);
	
	String arr[] = {"Gowtham","gowtham@gmail","12345","India","afrg"};
	
	for (int i = 0; i < sz; i++) {
		
		WebElement ele = we.get(i);
		ele.sendKeys(arr[i]);
		String val = ele.getAttribute("value");
		System.out.println(val);
		if (arr[i].equals(val)) 
		{
			System.out.println("entered value is matching with expected");
			
		} else 
		{
			System.out.println("entered value is not matching with expected");

		}
	}

}
	@AfterTest
	
	public void tearDown()
	{
		driver.quit();
		
	}
}

 