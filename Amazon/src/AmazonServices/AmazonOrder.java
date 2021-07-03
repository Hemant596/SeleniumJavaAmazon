package AmazonServices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOrder {
	
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com/");
			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("shoes");
			driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
			driver.findElement(By.linkText("adidas Men's Low-Top Gymnastics Shoes")).click();
			driver.findElement(By.cssSelector("#add-to-cart-button")).click();
			driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
			driver.findElement(By.cssSelector("input[type='email']")).sendKeys("hemant.hs828@gmail.com");
			driver.findElement(By.cssSelector(".a-button.a-button-span12.a-button-primary")).click();
			driver.findElement(By.cssSelector("#ap_password")).sendKeys("1@Connectkr1@");
			driver.findElement(By.cssSelector("#signInSubmit")).click();
			
	}

}
