package AmazonServices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_originStation1")).click();
		 driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_originStation1>option:nth-of-type(3)")).click();
	Select dept = new Select(depart);
		dept.selectByIndex(1);
		
		Thread.sleep(2000);
		WebElement departt = driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_destinationStation1"));
		Select deptt = new Select(departt);
		deptt.selectByVisibleText("Pune (PNQ)");*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2250)", "");
		
		WebElement dr = driver.findElement(By.xpath("//button[@title='Delhi']/child::div/child::div/child::div"));
		Select drr = new Select(dr);
		drr.selectByVisibleText("Bangkok");
		

	}

}
