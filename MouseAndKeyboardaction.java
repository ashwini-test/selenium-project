package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardaction {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Projects\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	Actions a =new Actions(driver);
	//put capital letter in textbox
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("pens").build().perform();
	
	//select the text
	
    a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("pens").doubleClick().build().perform();

	//hover the element
	a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	
	
	
	
	
	}

}
