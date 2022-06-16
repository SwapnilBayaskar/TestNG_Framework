package com.TestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
	
	boolean blnSetup = true;
	
	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("This test is not complete, skipping this");
	}
	
	@Test
	public void skipTest2() {
		System.out.println("Forcefully skipping this");
		throw new SkipException("Skipping this test");
	}
	
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test based on condition");
		
		if (blnSetup == true) {
			System.out.println("Execute the test");
		}else {
			System.out.println("Skip the test");
			throw new SkipException("Do not execute because condition is not met");
		}
	}

}
