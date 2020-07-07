package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SibilingXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://dictionary.cambridge.org/dictionary/english/tour");
		
		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[1]/following-sibling::li[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[1]/following-sibling::li[2]")).click();
		
	
		
		
		
	}                         
}
