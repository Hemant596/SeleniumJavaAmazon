package AmazonServices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NoOfLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\unzipped\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www-review-cert-tc1.thinkcentral.com/content/hsp/math/hspmath/na/common/itools_int_9780547584997_/html/basetenblocks/basetenblocks.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".menu")).click();
		List<WebElement> links =driver.findElements(By.cssSelector(".menu-popup-container>div+ul>li>a"));
		Thread.sleep(3000);
		for(int i=0;i<links.size();i++) {
			if(links.get(i).getText().contains("Subtract")) {
				links.get(i).click();
				break;
			}
		}
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("Subtract")) {
			System.out.println("Test is pass");
		}else {
			System.out.println("Test is fail");
		}
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".leftmenuItem.selected>img")).click();
		Thread.sleep(3000);
		{
			
			 
				 
				  
				  
			 
//	for(int i =0;i<1000;i++) {
//		driver.findElement(By.cssSelector("#onesCanvas1")).click();
//		driver.findElement(By.cssSelector(".button.outline.eraser-1")).click();
//	}

}}}
