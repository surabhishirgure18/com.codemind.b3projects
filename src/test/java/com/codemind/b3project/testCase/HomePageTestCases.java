package com.codemind.b3project.testCase;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.codemind.b3project.pages.HomePage;


public class HomePageTestCases {

	WebDriver driver;
	HomePage homePage;
	
	@BeforeMethod
	public void initilizedBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe")	;
		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	}
	
	@Test
	public void verifyValidLogin() {
		homePage =new HomePage(driver);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		homePage.setUserName();
	    homePage.getUserName().sendKeys("test1");
	    homePage.setPassword();
	    homePage.getUserName().sendKeys("test");
	    homePage.setLoginButton();
	    homePage.getLoginButton().click();
	    homePage.setLoginButton();
	    assertEquals(homePage.getLoginSuccessfullyMsg().getText(), "Login Successfully");
	    //softassert is also known as verify 
	    SoftAssert softAssert=new SoftAssert();
	    softAssert.assertEquals(homePage.getLoginSuccessfullyMsg().getText(), "Login Successfully");
	    
	    

	}
	
}
