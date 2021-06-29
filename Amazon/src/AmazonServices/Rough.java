package AmazonServices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.google.com/"); 
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Slippers");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("slippers");
		//driver.findElement(By.cssSelector(".L0Z3Pu")).click();
		List<WebElement> links=driver.findElements(By.cssSelector("ul[class='erkvQe']>li"));
		System.out.println(links.size());
		for( int i=0; i<links.size();i++) {
			System.out.println(links.get(i).getText());
			if(links.get(i).getText().contains("slippers online")) {
				links.get(i).click();
				break;
			}
		}
	}

}
