package com.tr.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAccountMonsterPage {
	
	WebDriver driver;
	boolean flag = false;
	String text = null;
	WebElement element; 
	Alert alert;
	
	public CreateAccountMonsterPage(WebDriver driver){
		this.driver = driver;
	}
	
	By createYourProfileText = By.xpath("//h1[contains(.,'Create your Profile on')]");
	By firstNameField = By.xpath("//input[@id='firstName_id']");
	By lastNameField = By.xpath("//input[@id='lastName_id']");
	By eMailIdField = By.xpath("//input[@id='email']");
	By passWordField = By.xpath("//input[@id='passwd_id']");
	By currentLocationField = By.id("select2-chosen-1");
	By currentLocationDropDown = By.id("select2-result-label-4");
	By mobileNumberField = By.id("mobile2");
	By totalExperienceField = By.id("expYrMonth");
	By numberOfYear = By.id("exp_year2");
	By numberOfMonths = By.id("exp_month6");
	By closeExperienceWindow = By.xpath("//div[@class='right clip_image closedropdown']");
	By selectYear = By.xpath("//input[@id='exp_year2']");
	By selectMonth = By.xpath("//input[@id='exp_month6']");
	By keySkillsField = By.id("skills");
	By industryField = By.id("ind_value");
	By industrySelected = By.id("other_ind_32_val");
	By closeIndustry = By.xpath("//div[@class='right clip_image closedropdown']");
	By functionField = By.id("cat");
	By selectedFunctionalArea = By.id("other_cat_22_val");
	By closeFunctional = By.xpath("//div[@class='right clip_image closedropdown']");
	By upLoadFileField = By.id("wordresume");
	By acceptTermsButton = By.id("accept_privacy_id");
	By privacyStatementLink = By.linkText("privacy statement");
	By termsOfUseLink = By.linkText("terms of use");
	By defaultPreferencesLink = By.linkText("default preferences");
	By googlePlusIcon = By.xpath("//a[@class ='left sclnk gplus']");
	By faceBookIcon = By.xpath("//a[@class='left sclnk fb']");
	By yahooIcon = By.xpath("//a[@class='left sclnk yahoo']");
	By findBetterWithText = By.xpath("//h2[contains(.,' Find Better with')]");
	By monsterVerifyText = By.xpath("//h2[@class='frmright_h2 colr']");
	By findEpmloyee = By.xpath("//div[@class='separate']");
	By alreadyMember = By.xpath("//div[2][contains(.,'Already a member?')]");
	By createAccountNow = By.id("continue");
	By alreadyMemberSignInHere = By.linkText("Sign In Here");
	
	/**
	 * This method help us to verify text is present or not
	 * @param No parameters
	 * @return boolean
	 * @throws Exception
	 */
	public boolean textIsDisplyed(){
		
		element = driver.findElement(createYourProfileText);
		flag = element.isDisplayed();
		
		if (flag) {System.out.println("text is displayed");
			
		} else { System.out.println("text is not displayed");

		}
		return flag;
	}
	/**
	 * This method help us to verify First name field is present or not
	 * @param No parameters
	 * @return boolean
	 * @throws Exception
	 */
	public boolean isDisplayedFirstNameField(){
	
		element = driver.findElement(firstNameField);
		flag = element.isDisplayed();
		if (flag) { System.out.println("first name field is displayed");
			
		} else { System.out.println("first name field is not displayed");

		}
		flag = element.isEnabled();
		
		if (flag) { System.out.println("first name field is enabled");
			
		} else {System.out.println("first name field is disabled");

		}
		return flag;
}
	/**
	 * This method help us to enter the first name
	 * @param params String firstName 
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountMonsterPage enterFirstName(String firstName){
		
		element = driver.findElement(firstNameField);
		element.sendKeys(firstName);
		return this;
	}	
	/**
	 * This method help us to verify last name field and enter the last name
	 * @param params String lastName
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountMonsterPage verifylastNameTextField(String lastName) throws Exception{
		
		try {
			element = driver.findElement(lastNameField);
			flag = element.isDisplayed();
			if (flag) { System.out.println("verify last name field is displayed");
				
			} else { System.out.println("verify last name field is not displayed");

			}
			flag = element.isEnabled();
			if (flag) { System.out.println("verify last name field is enabled");
			
			} else { System.out.println("verify last name field is not enabled");

			}
			element.sendKeys(lastName);
			
		} catch (Exception e) {
			throw new Exception("Failed while entering last name::"+"verifylastnameTextField::"+e.getLocalizedMessage());			
	
		}
		return this;
		
}
	/**
	 * This method help us to verify email id field and enter the email id
	 * @param params String emailId
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountMonsterPage verifyEmailIdTextField(String emailId) throws Exception{
		
		try {
			element = driver.findElement(eMailIdField);
			flag = element.isDisplayed();
			if (flag) { System.out.println("verify email id field is displayed");
			
			} else { System.out.println("verify email id field is not displayed");

			}
			flag = element.isEnabled();
			if (flag) { System.out.println("verify email id field is enabled");
			
			} else { System.out.println("verify email id field is not enabled");

			}
			element.sendKeys(emailId);
		} catch (Exception e) {
			throw new Exception("Failed while entering email id::"+"verifyEmailIdTextField::"+e.getLocalizedMessage());			

		}
		return this;
		
		/**
		 * This method help us to verify password field and enter the password
		 * @param params String passWord
		 * @return this
		 * @throws Exception
		 */
}
	public CreateAccountMonsterPage verifyPassWordTextField(String passWord) throws Exception{
		try {
		element = driver.findElement(passWordField);
		flag = element.isDisplayed();
		if (flag) { System.out.println(" password field is displayed");
		
		} else { System.out.println("password field is not displayed");

		}
		flag = element.isEnabled();
		if (flag) { System.out.println("password field is enabled");
		
		} else { System.out.println("password field is  disabled");

		}
		element.sendKeys(passWord);
		}
		catch (Exception e) {
			throw new Exception("Failed while entering the password::"+"verifyPassWordTextField::"+e.getLocalizedMessage());			
		}
		return this;
		
		
}
	/**
	 * This method help us to verify current location and select the location
	 * @param no parameters
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountMonsterPage verifyCurrentLocationTextField() throws Exception{
		
		try {

			element = driver.findElement(currentLocationField);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "element is not displayed");
			flag = element.isEnabled();
			Assert.assertTrue(flag, "text box is not enabled");
			element.click();
			Actions action = new Actions(driver);

			element = driver.findElement(currentLocationDropDown);
			action.moveToElement(element);
			action.click().build().perform();
			//Select location = new Select(driver.findElement(currentLocationField));
			//location.selectByVisibleText(currentLocation);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new Exception("Failed while selecting location::"+"verifyCurrentLocationTextField"+e.getLocalizedMessage());			
		}
		return this;
}
	/**
	 * This method help us to verify mobile field and enter the mobile number
	 * @param params String mobileNumber
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountMonsterPage verifyMobileNumberField(String mobileNumber) throws Exception{
		
		try {
			element = driver.findElement(mobileNumberField);
			flag = element.isDisplayed();
			if (flag) { System.out.println("moblile number field is displayed");
			
			} else { System.out.println("mobile number field is not displayed");

			}
			flag = element.isEnabled();
			if (flag) { System.out.println("mobile number field is enabled");
			
			} else { System.out.println("mobile number field is disabled");

			}
			element.sendKeys(mobileNumber);
			
		} catch (Exception e) {
			throw new Exception("Failed while entering the mobile number::"+"verify mobile number Field"+e.getLocalizedMessage());			
	
		}
		return this;
		
}
	
	/**
	 * This method help us to verify total experience field and select the year and month
	 * @param no parameters
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountMonsterPage verifyTotalExperienceField() throws Exception{
		try {
			element = driver.findElement(totalExperienceField);
			element.click();
			Actions action = new Actions(driver);
					
			element = driver.findElement(numberOfYear);
			action.moveToElement(element);
			action.click().build().perform();
			element = driver.findElement(numberOfMonths);
			action.moveToElement(element);
			action.click().build().perform();
			element = driver.findElement(closeExperienceWindow);
			action.moveToElement(element);
			action.click().build().perform();
			
		} catch (Exception e) {
			throw new Exception("pop up window can not be handled::"+"verifyTotalExperienceField::"+e.getLocalizedMessage());
		
		}
		
		return this;		
		
}
	
	/**
	 * This method help us to verify key skills field and enter the last key skills
	 * @param params String keySkills
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountMonsterPage verifyKeySkillsField(String keySkills) throws Exception{
		
		try {
			element = driver.findElement(keySkillsField);
			flag = element.isDisplayed();
			if (flag) { System.out.println("key skills field is displayed");
			
			} else { System.out.println("key skills field is not displayed");

			}			
			flag = element.isEnabled();
			if (flag) { System.out.println("key skills field is enabled");
			
			} else { System.out.println("key skills field is not disabled");

			}			
			element.sendKeys(keySkills);
			
		} catch (Exception e) {
			throw new Exception("key skills set field is failed::"+"verifyKeySkillsField::"+e.getLocalizedMessage());

			
		}
		return this;
		
}
	/**
	 * This method help us to verify industry field and select the industry
	 * @param no parameters 
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountMonsterPage verifyIndustryField() throws Exception{
		
		try {
			Actions action = new Actions(driver);
			element = driver.findElement(industryField);
			element.click();
			element = driver.findElement(industrySelected);
			action.moveToElement(element);
			action.click().build().perform();
			element = driver.findElement(closeIndustry);
			action.moveToElement(element);
			action.click().build().perform();
			
			
		} catch (Exception e) {
			throw new Exception("industry drop down value is not selected::"+"verifyIndustryField::"+e.getLocalizedMessage());
		}
		
		return this;
		
}
	/**
	 * This method help us to verify functions field and select the functions
	 * @param no parameters
	 * @return this
	 * @throws Exception
	 */
	public CreateAccountMonsterPage veifyFunctionField() throws Exception{
		
		try {
			Actions action = new Actions(driver);
			element = driver.findElement(functionField);
			element.click();
			element = driver.findElement(selectedFunctionalArea);
			action.moveToElement(element);
			action.click().build().perform();
			element = driver.findElement(closeFunctional);
			action.moveToElement(element);
			action.click().build().perform();
			
			
		} catch (Exception e) {
			throw new Exception("functional field value is not selected::"+"verifyFunctionalField::"+e.getLocalizedMessage());

		}
		return this;
	}	
		public CreateAccountMonsterPage windowHandlesUpLoadResume() throws Exception{
			try {
				//String expTitle = "Monster Privacy Commitment, Resume, Job Seeker Contact Information Access on job site - MonsterIndia.com";
				String parentWindow = driver.getWindowHandle();
				element = driver.findElement(privacyStatementLink);
				flag = element.isDisplayed();
				if (flag) { System.out.println("privacy statement link is displayed");
				
				} else { System.out.println("privacy statement link is not displayed");

				}
				//text = element.getText();
				element.click();
				Thread.sleep(5000);
				//String actTitle = driver.getTitle();
				//Assert.assertEquals(actTitle, expTitle, "actual title not matching");
				driver.switchTo().window(parentWindow);
				element = driver.findElement(termsOfUseLink);
				if (flag) { System.out.println("terms of use link is displayed");
				
				} else { System.out.println("terms of use link is not displayed");

				}
				element.click();
				Thread.sleep(3000);
				driver.switchTo().window(parentWindow);
				element = driver.findElement(defaultPreferencesLink);
				if (flag) { System.out.println("default preferences link is displayed");
				
				} else { System.out.println("default preferences link is not displayed");

				}
				element.click();
				Thread.sleep(3000);
				driver.switchTo().window(parentWindow);
				
			} catch (Exception e) {
				throw new Exception("un able to get the title of privacy link"+"windowHandlesUpLoadResume::"+e.getLocalizedMessage());
			}
			
			return this;
			
		}
		
		/**
		 * This method help us to verify google plus icon present or not 
		 * @param no parameters 
		 * @return boolean
		 * @throws Exception
		 */
		
		public boolean isDisplayedGooglePlusIcon(){
			
			element = driver.findElement(googlePlusIcon);
			flag = element.isDisplayed();
			if (flag) { System.out.println("google plus logo is displayed");
				
			} else { System.out.println("google plus logo is not displayed");

			}
			return flag;
			
		}
		
		/**
		 * This method help us to verify facebook icon is present or not 
		 * @param no parameters 
		 * @return boolean
		 * @throws Exception
		 */
		public boolean isDisplayedFacebookIcon(){
			
			element = driver.findElement(faceBookIcon);
			flag = element.isDisplayed();
			if (flag) {	System.out.println("facebook logo is displayed");
				
			} else { System.out.println("facebook logo is not displayed");

			}
			return flag;
		}
		
		/**
		 * This method help us to verify yahoo icon is present or not 
		 * @param no parameters 
		 * @return boolean
		 * @throws Exception
		 */
		public boolean isDisplayedYahooIcon(){
			element = driver.findElement(yahooIcon);
			flag = element.isDisplayed();
			if (flag) { System.out.println("yahoo logo is displayed");
				
			} else { System.out.println("yahoo logo is not displayed");

			}
			return flag;
		}
		
		/**
		 * This method help us to verify find better with text is present or not and get the text
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public CreateAccountMonsterPage verifyfindBetterWithText(){
			element = driver.findElement(findBetterWithText);
			element.isDisplayed();
			if (flag) { System.out.println("text is present");
				
			} else { System.out.println("text is not present");

			}
			text = element.getText();
			System.out.println("the text present is::"+text);
			return this;

		}
		
		/**
		 * This method help us to verify monster text is present or not and get the text
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public CreateAccountMonsterPage verifyMonsterText(){
			element = driver.findElement(monsterVerifyText);
			element.isDisplayed();
			if (flag) { System.out.println("Monster text is present");
			
			} else { System.out.println("Monster text is not present");

			}
			text = element.getText();
			System.out.println("the text present is::"+text);
			return this;
		}
		
		/**
		 * This method help us to verify number of employees present and get the values 
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public CreateAccountMonsterPage numberOfEmployees(){
			element = driver.findElement(findEpmloyee);
			flag = element.isDisplayed();
			if (flag) { System.out.println("number of employees value is displyed");
				
			} else { System.out.println("number of employees value is not displyed");

			}
			text = element.getText();
			System.out.println("number of employees::"+text);
			return this;
		}
	
		/**
		 * This method help us to verify already a member text is present or not and get the text
		 * @param no parameters 
		 * @return this
		 * @throws Exception
		 */
		public CreateAccountMonsterPage verifyAlreadyMember(){
			
			element = driver.findElement(alreadyMember);
			flag = element.isDisplayed();
			if (flag) { System.out.println("already a member text is displayed");
				
			} else { System.out.println("already a member text is not displayed");

			}
			
			text = element.getText();
			System.out.println("the text is ::"+text);
			return this;
		}
		
		public CreateAccountMonsterPage upLoadResume(){
			element = driver.findElement(upLoadFileField);
			flag = element.isDisplayed();
			if (flag) { System.out.println("up load file field is displayed");
				
			} else { System.out.println("up load file field is not displayed");

			}
			String text =	element.getText();
			System.out.println(text);
			//element.click();
			element.sendKeys("C:\\Users\\system1\\Desktop\\resume.txt");
			
			return this;
		}
		public MonsterResumeUploadPage clickCreateNow() throws Exception{
			try {
				element = driver.findElement(createAccountNow);
				flag = element.isDisplayed();
				if (flag) { System.out.println("create account is displayed");
					
				} else { System.out.println("create account is not displayed");

				}
				element.click();
				
			} catch (Exception e) {
				throw new Exception("unable to click on create now"+"clickCreateNow"+e.getLocalizedMessage());
			}
			return new MonsterResumeUploadPage(driver);
		}
				
}
