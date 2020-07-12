package SeleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMultipleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/windows");
	    driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
	    Set<String> id= driver.getWindowHandles();
	    Iterator<String> it= id.iterator();
	    String Parentid =it.next();
	    String Childid=it.next();

	    driver.switchTo().window(Childid);
	    System.out.println( driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	    
	    driver.switchTo().window(Parentid);
	    System.out.println( driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
	}

}
