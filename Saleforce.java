package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saleforce {

	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	 
	driver.get("http://login.salesforce.com");
	
	driver.findElement(By.id("username")).sendKeys("abcd");
	
	driver.findElement(By.name("pw")).sendKeys("123");
	
	driver.findElement(By.name("Login")).click();
	
	driver.close();
	
		
		
		
	}

}
