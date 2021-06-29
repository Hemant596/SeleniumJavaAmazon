package AmazonServices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://magic-ce-projects.s3.amazonaws.com/Content_2966-Number-Worlds-Intervention-Portfolio-Flash-Remediation/Places_Scenes/2021-05-29_15-15-34/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//page load time, selenium 40 second tak wait krega agr 40 sec me nhi hua to error dega, agr 40se km me ho gya to baki ka ignore kr dega
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// occur after pageloadtime that wait is for element on the page
		Thread.sleep(4000);
		//driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.cssSelector("div.hidden.draggable.draggable-shape.numbers.num10.ui-draggable.ui-draggable-handle")))
		.moveToElement(driver.findElement(By.cssSelector("div.drag.imgPanel3.ui-draggable-handle")))
		.release()
		.build()
		.perform(); 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.clearBtn ")).click();   
		Thread.sleep(2000);
		for(int d = 0; d<2; d++) {
		WebElement down111 = driver.findElement(By.cssSelector("div.downBtn "));
		down111.click();}
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("div.downBtn ")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.shape3.image11")).click();
		Thread.sleep(2000);
		action.clickAndHold(driver.findElement(By.cssSelector("div.drag.imgPanel1.ui-draggable-handle")))
		.moveToElement(driver.findElement(By.cssSelector("div.rightPanel")))
		.release()
		.build()
		.perform();
	}

}
