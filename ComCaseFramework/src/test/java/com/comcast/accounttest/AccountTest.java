package com.comcast.accounttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AccountTest {
	
	@Test(groups = "smokeTest")
	public void createAccountTest() {
		String browser  = System.getProperty("browser");
		String url = System.getProperty("url");
		System.out.println("Browser==>"+ browser);
		System.out.println("URL==>"+ url);
		System.out.println("execute createAccountTest");
	}
	@Test(groups = "regressionTest")
	public void modifyAccountTest() {
		System.out.println("execute modifyAccountTest");
	}

}
