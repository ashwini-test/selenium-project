package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	
	public static void main(String args[] )
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Ashwini");
		
		driver.findElement(By.name("pass")).sendKeys("ashwini1");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		
	}
}
