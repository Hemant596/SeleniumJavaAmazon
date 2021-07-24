package AmazonServices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FreeCRMPractice {

	public static void main(String[] args) throws InterruptedException {
//		@FindBy(name="email")
//		WebElement username;
//		
//		@FindBy(name="password")
//		WebElement password;
//		
//		@FindBy(css = ".ui.fluid.large.blue.submit.button")
//		WebElement login;

		
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.cssSelector("input[placeholder='E-mail address']")).sendKeys("hemant.hs828@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("2@Discus2@");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.cssSelector(".ui.left.fixed.vertical.icon.menu.sidebar-dark.left-to-right"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='/contacts']+button>i")).click();
        Thread.sleep(5000);
        ac.moveToElement(driver.findElement(By.cssSelector(".item>button+button"))).build().perform();
	    //driver.quit();
	}

}
