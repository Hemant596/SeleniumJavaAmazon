package AmazonServices;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/"); 
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
//		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hemant.hs828@gmail.com");
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("2@Discus2@");
//		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();
        List<WebElement> linklist = driver.findElements(By.tagName("a"));
        linklist.addAll(driver.findElements(By.tagName("img")));
        
        System.out.println("Total :"+linklist.size());
        
        List<WebElement> links = new ArrayList<WebElement>();
        
        for(int i=0;i<linklist.size();i++) {
        	if(linklist.get(i).getAttribute("href") != null) {
        		links.add(linklist.get(i));
        	}
        }
        System.out.println("Except null : "+links.size());
        
        for(int j=0; j<links.size();j++) {
        HttpURLConnection connection =	(HttpURLConnection)  new URL(links.get(j).getAttribute("href")).openConnection();
        connection.connect();
        String response = connection.getResponseMessage();
        connection.disconnect();
        System.out.println(links.get(j).getAttribute("href")+"----->"+response);
        	
        }
	}

}
