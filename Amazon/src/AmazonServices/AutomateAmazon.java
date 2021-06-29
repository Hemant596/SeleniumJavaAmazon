package AmazonServices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone Watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.navigate().to("https://www.amazon.com/s?k=Iphone+Watch&ref=nb_sb_noss");
		driver.findElement(By.className("s-image")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
