package com.tr.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MonsterResumeUploadPage {
	
	WebDriver driver;
	boolean flag = false;
	String text = null;
	WebElement element;
	
	public MonsterResumeUploadPage(WebDriver driver){
		this.driver = driver;
	}
	By skipAndContinue = By.linkText("Skip & Continue »");
	By resumeTitle = By.id("restitle");
	By nationality = By.id("select2-chosen-4");
	By searchField = By.id("s2id_autogen1_search");
	By indian = By.id("select2-result-label-687");////ul[@id='select2-results-4']/li
	By gender = By.id("gender1_label");
	By dobDateClick = By.id("dob_dd_id");
	By dateDOB = By.xpath("//div/ul/li/a[@data-value='dob_dd']");
	//By dateDOB = By.xpath(".//*[@id='dd_container']/div[1]/div[3]/ul/li[*]/a");
	By monthDOB = By.id("dob_mm_id");
	By yearDOB = By.id("dob_yy_id");
	By jobType = By.id("jobType");
	By openToWorkInStartUp = By.id("startupWork");
	By preferredJobLocation = By.id("pref_location");
	By locationId = By.id("other_pref_location_2_check");
	By closeLocation = By.xpath("//div[@class='right clip_image closedropdown']");
	By roles = By.id("selRol");
	By jobRole = By.id("top_selRol_188_val");
	By roleClose = By.xpath("//div[@class='right clip_image closedropdown']");
	By designation = By.id("designation_1");
	By companyName = By.id("company_name_1");
	By fromDate = By.id("wh_date_from1");
	By selectMonthDropDown = By.xpath("//select[@class='ui-datepicker-month']");
	By selectYeadDropDown = By.xpath("//select[@class='ui-datepicker-year']");
	By toDate = By.id("wh_date_to1");
	By selectToDateDropDownMonth = By.xpath("//select[@class='ui-datepicker-month']");
	By selectToDateDropDownYear = By.xpath("//select[@class='ui-datepicker-year']");

	By salary = By.id("sal1");
	By salaryLacs = By.xpath("//div/label/div/div/input[@name='SalLac1']");
	By salaryThousands = By.xpath("//div/label/div/div/input[@name='SalTh1']");
	By closeSalary = By.xpath("//div[@class='right clip_image closedropdown']");
	By noticePeriod = By.id("notice_period");
	By noticePeriodValues = By.xpath("//ul/li/a[@data-value='notice_period']");
	
	//Project Worked on
	By projectTitle = By.id("proj_title_1");
	By projectFromDate = By.id("proj_from_date_1");
	By projectFromDateMonth = By.xpath("//select[@class='ui-datepicker-month']");
	By projectFromDateYear = By.xpath("//select[@class='ui-datepicker-year']");
	
	By projectToDate = By.id("proj_to_date_1");
	By projectToDateMonth = By.xpath("//select[@class='ui-datepicker-month']");
	By projectTodateYear = By.xpath("//select[@class='ui-datepicker-year']");
	By descriptionOfProject = By.id("proj_descr_1");
	
	//Qualification
	
	By highestQualification = By.id("proj_descr_1");
	By selectHighestQualification = By.xpath("//ul/li/a[@data-value='highest_degree']");
	
	By yearOfPassing = By.id("highest_passYear_id");
	By institution = By.id("highest_institute_id");
	By institutionName = By.xpath("//div/ul/li/a[@class='option_item']");
	
	
	//certificate
	
	By certificateName = By.id("certi_name_1");
	By issuedBy = By.id("certi_issuedBy_1");
	By issuedDate = By.id("certi_validity_1");
	By issuedMonth = By.xpath("//select[@class='ui-datepicker-month']");
	By issuedYear = By.xpath("//select[@class='ui-datepicker-year']");
	
	//upload photograph
	
	By upLoadPhotoGraph = By.id("imgupload_id");
	
	
	//Language known
	
	By languageKnown = By.id("imgupload_id");
	By read = By.id("lang1read1_label");
	By write = By.id("lang1write1_label");
	By speak = By.id("lang1spk1_label");
	
	By alternativeEmail = By.id("alt_email_id");
	
	//Affirmative actions
	
	By category = By.id("infirm_category_id");
	By disability = By.id("infirm_disability2_label");
	
	//submit button
	
	By submit = By.id("submit1_id");
	
	public MonsterResumeUploadPage resumeOfTitle(String resumeName){
		
		element = driver.findElement(resumeTitle);
		element.isDisplayed();
		element.isEnabled();
		element.sendKeys(resumeName);
		return this;
	}
	
	
	
	
	public MonsterResumeUploadPage selectNationality(String country){
	
		element = driver.findElement(nationality);
		element.click();
		
		element = driver.findElement(searchField);
		element.sendKeys(country);
		
		element = driver.findElement(indian);
		element.click();
		
		String text = element.getAttribute("value");
		System.out.println("the selected country is::"+text);
		
		return this;
	}
	
	public MonsterResumeUploadPage selectGender(){
		
		element = driver.findElement(gender);
		flag = element.isDisplayed();
		System.out.println("the male button is displayed::"+flag);
		element.click();
		
		return this;
		
	}
	
	public MonsterResumeUploadPage dateOfBirth(String date) {
		element = driver.findElement(dobDateClick);
		element.click();
		element = driver.
	
		/*element = driver.findElement(monthDOB);
		Select monthOfDOB= new Select(element);
		monthOfDOB.selectByIndex(month);
		
		element = driver.findElement(yearDOB);
		Select yearOfDOB = new Select(element);
		yearOfDOB.selectByIndex(year);*/
		
		
		
		return this;
		
		
	}
	
	
	public AviatorSelectPage clickSkipContinue() throws Exception{
		
		try {
			element = driver.findElement(skipAndContinue);
			element.click();
			
		} catch (Exception e) {
			throw new Exception("unable to click on skip and continue"+"clickSkipContinue"+e.getLocalizedMessage());
		}
		return new AviatorSelectPage(driver);
	}
	
	
}
