package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "//Users//akash.shinde//Eclipse//chromedriver");
		
		WebDriver driver =new ChromeDriver();
				
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		WebElement from =driver.findElement(By.id("fromCity"));
	
		from.sendKeys("mum");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='Mumbai']")).click();
	
	}
}
