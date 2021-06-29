package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google","title is not matched");
	}
	
	@Test(priority=3,groups="Mail")
	public void getMail() {
		boolean c = driver.findElement(By.xpath("//a[@data-pid='23' and  @class='gb_f']")).isDisplayed();
		//Assert.assertTrue(c);
		Assert.assertEquals(c, true);
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
