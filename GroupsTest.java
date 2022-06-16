package com.TestCases;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "user-registration")
public class GroupsTest {
	
	@BeforeGroups(value = "regression")
	public void beforeGroupsMethod() {
		System.out.println("Execute this method before regression groups");
	}
	
	@AfterGroups(value = "regression")
	public void afterGroupsMethod() {
		System.out.println("Execute this method after regression groups");
	}
	
	@Test(priority = 0, groups = "regression")
	public void openRegistrationPage() {
		System.out.println("Registration form is opened");
	}
	
	@Test(priority = 1, groups = "regression")
	public void setUserName() {
		System.out.println("User name is added");
	}
	
	@Test(priority = 2, groups = {"regression", "smoke"})
	public void setEmailAddress() {
		System.out.println("Email is entered");
	}
	
	@Test(priority = 3, groups = "smoke")
	public void clickOnRegister() {
		System.out.println("User is Registered");
	}
	
	

}
