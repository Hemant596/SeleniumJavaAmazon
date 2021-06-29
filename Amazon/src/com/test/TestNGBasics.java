package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
		Assert.assertEquals(12, 12);
		
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login Method");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch browser");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@Test(priority=2)
	public void googleTitleTest() {
		System.out.println("google title test");
	}
	
	@Test(priority=1)
	public void searchTest() {
		System.out.println("search Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}
	
	@AfterClass
	public void classBrowser() {
		System.out.println("Close Browser");
	}
	
}

