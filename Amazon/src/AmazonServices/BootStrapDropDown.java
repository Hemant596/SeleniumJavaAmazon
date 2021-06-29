package AmazonServices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\unzipped\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*driver.findElement(By.cssSelector(".multiselect-selected-text")).click();
		List<WebElement> list = driver.findElements(By.cssSelector(".multiselect-container.dropdown-menu>li>a>label"));
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular")) {
			list.get(i).click();
			break;
			}
			
		}*/
		
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		List<WebElement> list = driver.findElements(By.cssSelector(".dropdownDiv>ul>li")); 
		System.out.println(list.size());
		
		 for(int i=0;i<list.size();i++) 
		 { //System.out.println(list.get(i).getText());
		  if(list.get(i).getText().contains("Ajmer (KQH)"))
		  { list.get(i).click();
		 break; 
		 }
		  }
		 //driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
			
			  List<WebElement> listt =driver.findElements(By.cssSelector(".dropdownDiv>ul>li"));
			  System.out.println(listt.size());
			  
			  for(int i=0;i<listt.size();i++) {
			  //System.out.println(list.get(i).getText());
			  if(list.get(i).getText().contains("Chennai (MAA)")) { 
				  list.get(i).click();
			  break; 
			  } }
			  
			  List<WebElement> lista = driver.findElements(By.xpath("//td[@data-month='5']"));
				for ( int i=0 ; i<lista.size();i++) {
					//System.out.println(lista.get(i).getText());
					if(lista.get(i).getText().contains("9")) {
						lista.get(i).click();
						break;
					}}
						
					
					  driver.findElement(By.cssSelector("input#ctl00_mainContent_txt_Todate+button")).click(); 
					  List<WebElement> listaa =driver.findElements(By.xpath("//td[@data-month='5']")); 
					  for ( int j=0 ;j<listaa.size();j++) { //System.out.println(listaa.get(j).getText());
					  if(listaa.get(j).getText().contains("15")) 
					  { listaa.get(j).click(); 
					  break; 
					  }
					  
					  }
					 
			  
	}

	}
