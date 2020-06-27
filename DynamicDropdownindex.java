package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownindex {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "//Users//akash.shinde//Eclipse//chromedriver");
			
	WebDriver driver =new ChromeDriver();
			
	driver.get("https://www.spicejet.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000);

	driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();

	}

}
