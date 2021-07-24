package AmazonServices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/resources/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    // Implicitly wait -- is always applied globally-- is available for all the element.
		// Suppose element is visible in the 5 seconds then other 15 seconds will be ignored that's why we call this dynamic wait.
		//dynamic in nature
		// It can be changed anywhere and at anytime in your code.
	
//        List<WebElement> links = (driver.findElements(By.tagName("a")));
//        int count = links.size();
//        System.out.println("No of links in this site are : "+count);
//		List<WebElement> links = driver.findElements(By.cssSelector(".menu-popup-container>div+ul>li"));
//		for(int i = 0; i<links.size();i++) {
//			if(links.get(i).getText().contains("Activity")) {
//				links.get(i).click();
//				break;
//	}
//
//}
//}
	
	/*Explicitly wait
	 * 1. no Explicitly or method used
	 * 2. available with WebDriverWait with some ExpectedConditions
	 * 3. specific to element
	 * 4. dynamic in nature
	 * 5. We should never use explicit and implicit wait together--> Selenium webdriver will wait for the element first 
	 * bcos of IMPLICIT WAIT and then Explicit Wait will be applied hence total syns wait will be increase for each element.
	 */
//	public void clickOnn(WebDriver driver, WebElement element, int timeout) {
//		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//	}
//	
//	public void clickOnn(WebDriver driver, WebElement element, int timeout, String value) {
//		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
//		element.sendKeys(value);
//    }
		
//		driver.findElement(By.cssSelector(".leftmenuItem.selected")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".leftmenuSubItemContainer>div[class='leftmenuItem  selected']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".drop-container-one.dropA>div")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#dropB")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".button-container>button:nth-of-type(1)")).click();
//		Thread.sleep(2000);
//		WebElement Answer = driver.findElement(By.cssSelector("input[name='totalValue']"));
//		Answer.sendKeys("2");  
//		driver.findElement(By.xpath("//button[contains(text(),'Check Answer')]")).click(); 
//		driver.quit();
//		driver.findElement(By.xpath("//span//span[contains(text(),'Resources')]")).click();
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,550)", "");
		
		
	
}}
