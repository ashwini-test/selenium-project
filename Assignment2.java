package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
					
			System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
					
			WebDriver driver =new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			// checkbox count
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			
	}
}