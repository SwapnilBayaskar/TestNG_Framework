package com.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeSuite
	public void dataSetup() {
		System.out.println("Common data setup");
	}
	
	@AfterSuite
	public void dataCleanUp() {
		System.out.println("Common data clean up");
	}
	
	@BeforeTest //Run before all the(not each) of the test
	public void runApplication() {
		System.out.println("Appliation is started");
	}
	
	@AfterTest
	public void closeApplication() {
		System.out.println("Application is Closed");
	}
	
	@BeforeMethod //Run before each of the test case
	public void connectToDB() {
		System.out.println("Connected to DB");
	}
	
	@AfterMethod
	public void disconnectFromDB() {
		System.out.println("Disconnected from DB");
	}
	
	@Test(priority = 1, description = "This test is for Log in")
	public void loginTest() {
		System.out.println("Login is successful");
	}
	
	@Test(priority = 2, dependsOnMethods = "loginTest", description = "This test is for Log out")
	public void logoutTest() {
		System.out.println("Logged out Successfully");
	}

}
