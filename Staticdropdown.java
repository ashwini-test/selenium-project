package SeleniumProject;

import java.nio.channels.SelectionKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		
	       System.setProperty("webdriver.chrome.driver", "//Users//akash.shinde//Eclipse//chromedriver");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.spicejet.com/");
			Select s =new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		    Thread.sleep(3000);
			s.selectByIndex(2);
			
	       s.selectByVisibleText("INR");
	       Thread.sleep(2000);
	       
	       s.selectByValue("USD");
	        
	
	
	}
	
}
