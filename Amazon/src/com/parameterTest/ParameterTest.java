package com.parameterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	@Test
	@Parameters({"url","emailId","css"})
	public void yahoo(String url ,String emailId, String css) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys(emailId);
		driver.findElement(By.cssSelector(css)).click();
		
	}
	
	
}
