package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void initilizeWebDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void verifyUrlWithHardAssertion() {
		
		String strExpectedUrl = "https://www.amazon.in//";
		String strExpectedTitle = "";
		String strActualUrl = driver.getCurrentUrl();
		String strActualTitle = driver.getTitle();
		
		System.out.println("Verifying Url");
		Assert.assertEquals(strActualUrl, strExpectedUrl, "URL verification is failed");
		System.out.println("Verifying Title");
		Assert.assertEquals(strActualTitle, strExpectedTitle, "Title Verification is Failed");
		System.out.println("Browser is Closed");
		
	}
	
	@Test
	public void verifyUrlWithSoftAssertion() {
		SoftAssert objSoftAssert = new SoftAssert();
		
		String strExpectedUrl = "https://www.amazon.in//";
		String strExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String strActualUrl = driver.getCurrentUrl();
		String strActualTitle = driver.getTitle();
		
		System.out.println("Verifying Url");
		objSoftAssert.assertEquals(strActualUrl, strExpectedUrl, "URL verification is failed");
		System.out.println("Verifying Title");
		objSoftAssert.assertEquals(strActualTitle, strExpectedTitle, "Title Verification is Failed");
		System.out.println("Browser is Closed");
		
		objSoftAssert.assertAll();
		
	}

}
