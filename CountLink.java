package SeleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    System.out.println(driver.findElements(By.tagName("a")).size());	
	    
	    WebElement footer =driver.findElement(By.id("gf-BIG"));
	    System.out.println(footer.findElements(By.tagName("a")).size());
	    
	    WebElement column= footer.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));  
	    System.out.println(column.findElements(By.tagName("a")).size());
	    
	    for(int i=1;i<column.findElements(By.tagName("a")).size();i++)
	    {
	    	String clicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	column.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	    	Thread.sleep(4);
	    }
	    Set <String> id=driver.getWindowHandles();
	    Iterator <String> it= id.iterator();
	    while( it.hasNext())
	    {
	      driver.switchTo().window(it.next());
	      System.out.println(driver.getTitle());

	    }
	    
	}

}
