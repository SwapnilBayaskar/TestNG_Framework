package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	public WebDriver driver;
	
	@Test(dataProvider = "create")
	public void testDataProvider(String strUsername, String strPassword) {
		System.out.println(strUsername+"====="+strPassword);
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(strUsername);
		driver.findElement(By.id("password")).sendKeys(strPassword);
		driver.findElement(By.id("login-button")).click();
		
		driver.close();
	}
	
	@DataProvider(name = "create")
	public Object[][] dataSet1(){
		return new Object[][]
			{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
			};
	}

}
