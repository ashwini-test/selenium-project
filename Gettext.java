package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
	 
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("abcd");
		 
		driver.findElement(By.cssSelector("#password")).sendKeys("1233");

		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
	System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	
	}

}
