package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentdynamiccode {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String checkbox=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		Select s =new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(checkbox);
		
		driver.findElement(By.id("name")).sendKeys(checkbox);
		driver.findElement(By.id("alertbtn")).click();
		String msg=driver.switchTo().alert().getText();
		if(msg.contains(checkbox))
		{
			System.out.println("Text is present in popup window ");
	     }
		else
		{
			System.out.println("Text is not present in popup window ");
		}
		
	}

}
 