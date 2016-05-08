package com.tr.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowTest {

	public static void main(String args[]) throws InterruptedException{
		
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		String parentWindow1 = driver.getTitle();
		System.out.println("the parent window name is::"+parentWindow1.toString());
		WebElement window1 = driver.findElement(By.id("button1"));
		window1.click();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		
		WebElement window2 = driver.findElement(By.xpath("//button[@onclick ='newMsgWin()']"));
		window2.click();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		
		WebElement window3 = driver.findElement(By.xpath("//button[@onclick='newBrwTab()']"));
		window3.click();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		
		Set<String> windows = driver.getWindowHandles();
		windows.addAll(windows);
		List<String> mulWindow = new ArrayList<String>(windows);
		int size = mulWindow.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) {
			
			if (!mulWindow.equals(parentWindow)) {
				driver.switchTo().window(mulWindow.get(i));
				driver.close();
				}
			}
		
		/*driver.switchTo().window(mulWindow.get(2));
		String window2Title =driver.getTitle();
		System.out.println("window 2 title is::"+window2Title.toString());
		driver.close();
		
		driver.switchTo().window(mulWindow.get(1));
		String window1Title = driver.getTitle();
		System.out.println("window 1 title is::"+window1Title.toString());
		driver.close();
		
		driver.switchTo().window(mulWindow.get(3));
		String window3Title =driver.getTitle();
		System.out.println("window 3 title is::"+window3Title.toString());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		String parentWindowTitle =driver.getTitle();
		System.out.println("parent window title is::"+parentWindowTitle.toString());*/
		//driver.close();
	}
}
