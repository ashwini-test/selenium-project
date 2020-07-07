package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndFlow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//oneway 
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Thread.sleep(2000);
		//From
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);
		
		//To
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
		
		//DepartDate
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();		
		
		
		//ReturnDate disable 
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("date is disable state");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("date is enable state");
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//Passengers dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Select dropdown= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		dropdown.selectByValue("2");
		
		Select child= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByValue("2");
		
		
		//submit button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

	}

	}