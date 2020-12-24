package com.comcast.contacttest.copy;

import org.testng.annotations.Test;

public class ConatctTest {
	
	@Test(groups = "smokeTest")
	public void createContactTest() {
		System.out.println("execute createContactTest");
	}
	@Test(groups = "regressionTest")
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}

}
