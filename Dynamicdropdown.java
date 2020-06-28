package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "//Users//akash.shinde//Eclipse//chromedriver");
			
	WebDriver driver =new ChromeDriver();
			
	driver.get("https://www.spicejet.com/");	
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	Select s =new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	s.selectByIndex(2);
	driver.close();
		
		
		
	}

}
