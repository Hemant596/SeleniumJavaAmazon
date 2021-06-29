package AmazonServices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//driver.get("https://ui.cogmento.com/");
		
		driver.get("https://www.amazon.com/s?k=shoes+for+men&crid=1AGFB873VDRG3&sprefix=shoes%2Caps%2C388&ref=nb_sb_ss_ts-doa-p_1_5");
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		
//		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hemant.hs828@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("2@Discus2@");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("div.ui.fluid.large.blue.submit.button")).click();
		
//		Actions action = new Actions(driver);
//		
//		
//		action.moveToElement(driver.findElement(By.cssSelector("div#main-nav"))).build().perform();// use build and perform with action always

//		Actions action = new Actions(driver); 
//		action.moveToElement(driver.findElement(By.cssSelector("#imageBlock>div>div>div>ul>li+li+li+li+li+li+li"))).build().perform();
//		action.moveToElement(driver.findElement(By.cssSelector(".image.item.itemNo3.maintain-height.selected>span>span>div>img"))).build().perform();
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "");
//		driver.close();
		
		driver.findElement(By.cssSelector("li[id='p_89/Skechers']>span>a>div>label>input+i")).click();
	}

}
