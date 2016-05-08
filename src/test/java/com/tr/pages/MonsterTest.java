package com.tr.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MonsterTest {
	
	WebDriver driver;
	HomePageMonster homePageMonster = null;
	CreateAccountMonsterPage createAccountMonster = null;
	MonsterLoginPage monsterLoginPage = null;
	MonsterResumeUploadPage monsterResumeUpload = null;
	AviatorSelectPage aviatorSelectPage = null;
	boolean flag = false;
	String text = null;
	
	@BeforeTest
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("http://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=0)
	public void VerifyHomePage(){
		
		homePageMonster = new HomePageMonster(driver);
		flag = homePageMonster.logoIsDisplayed();
		Assert.assertTrue(flag, "site logo is not displayed");
		flag = homePageMonster.textIsDisplayed();
		Assert.assertTrue(flag, "text is not displayed");
		createAccountMonster = homePageMonster.clickUploadResume();
		}
	@Test(priority=1)
	public void createAccountTextVerifyText(){
		
		createAccountMonster = new CreateAccountMonsterPage(driver);
		flag = createAccountMonster.textIsDisplyed();
		Assert.assertTrue(flag, "the text is not displayed");
	}
	@Test(priority=2)
	public void verifyFistName() throws Exception{
		
		flag = createAccountMonster.isDisplayedFirstNameField();
		Assert.assertTrue(flag, "first name field is not displayed");
		createAccountMonster.enterFirstName("Gowtham");
	}	
	@Test(priority=3)
	public void verifyLastName() throws Exception{	
		
		createAccountMonster.verifylastNameTextField("H S");
	}
	@Test(priority=4)
		public void verifyEmailId() throws Exception{
		createAccountMonster.verifyEmailIdTextField("gowthamgowda4231@gmail.com");
		}
		
	@Test(priority=5)
		public void verifyPassword() throws Exception{
		createAccountMonster.verifyPassWordTextField("gowtham12345");
		}
	@Test(priority=6)
		public void verifyCurrentLocation() throws Exception{
		createAccountMonster.verifyCurrentLocationTextField();
		}
		
	@Test(priority=7)
		public void verifyMobileNumber() throws Exception{
		createAccountMonster.verifyMobileNumberField("9741199267");
		}
		
	@Test(priority=8)
		public void verifyTotalExperience() throws Exception{
		createAccountMonster.verifyTotalExperienceField();
		}
		
	@Test(priority=9)
		public void verifyKeySkills() throws Exception{
		createAccountMonster.verifyKeySkillsField("Core JAVA, selenium,");
		}
		
	@Test(priority=10)
		public void verifyIndustry() throws Exception{
		createAccountMonster.verifyIndustryField();
		}
		
	@Test(priority=11)
		public void verifyFunction() throws Exception{
		createAccountMonster.veifyFunctionField();
		}
		
	/*@Test(priority=12)
		public void verifyLinks() throws Exception{
		createAccountMonster.windowHandlesUpLoadResume();
		}*/
		
		
	@Test(priority=13)
		
		public void verifyGooglePlusLogo(){
		
		flag = createAccountMonster.isDisplayedGooglePlusIcon();
		Assert.assertTrue(flag, "google plus logo is not displayed");
		}	
		
	@Test(priority=14)
		
		public void verifyFacebookLogo(){
		flag =	createAccountMonster.isDisplayedFacebookIcon();
		Assert.assertTrue(flag, "facebook logo s not displayed");
		}
		@Test(priority=15)
		
		public void verifyYahoologo(){
		flag =	createAccountMonster.isDisplayedYahooIcon();
		Assert.assertTrue(flag, "yahoo logo is not displayed");
		
	}
		@Test(priority=15)
		
		public void verifyFindBetterWithText(){
			
		createAccountMonster.verifyAlreadyMember();
		
		}
		
		@Test(priority=16)	
		
		public void verifyMonsterText(){
			
			createAccountMonster.verifyMonsterText();
		}
		
		@Test(priority=17)
		public void verifyNumerOfEmployees(){
			createAccountMonster.numberOfEmployees();
			
		}
		@Test(priority=18)
		public void verifyAlreadyMemberText(){
			
			createAccountMonster.verifyAlreadyMember();
		}
		
		@Test(priority=19)
		
		public void verifyUploadResume(){
			createAccountMonster.upLoadResume();
		}
		
		@Test(priority=20)
		
		public void clickContinueNow() throws Exception{
			monsterResumeUpload =createAccountMonster.clickCreateNow();
			
		}
		
		@Test(priority=21)
		public void dateOfBirthVerify(){
			
			monsterResumeUpload = monsterResumeUpload.dateOfBirth("6");
			
		}
		/*@Test(priority=21)
		
		public void skipAndContinue() throws Exception{
			aviatorSelectPage =monsterResumeUpload.clickSkipContinue();
		}*/
		@Test(priority=22)
		public void verifyAviatorSelectPage(){
			aviatorSelectPage.verifyAviatorSelectTest();
		}
		@Test(priority=23)
		public void clickSaveAndContinue(){
			aviatorSelectPage.clickSaveAndContinue();
		}
}
