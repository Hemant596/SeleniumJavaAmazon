package AmazonServices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\unzipped\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		
		WebElement dayy=driver.findElement(By.id("day"));
		Select srr = new Select(dayy);
		srr.selectByVisibleText("9");
		Thread.sleep(2000);
		driver.close();
		
	}

}
