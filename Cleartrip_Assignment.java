package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip_Assignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		Select adults = new Select(driver.findElement(By.id("Adults")));

		adults.selectByValue("3");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Spicejet");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
