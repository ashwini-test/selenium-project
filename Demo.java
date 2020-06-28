package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//akash.shinde//Eclipse//chromedriver");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        
        System.out.println(driver.getCurrentUrl());
         
        System.out.println(driver.getPageSource());
    
        driver.navigate().to("http://yahoo.com");
     
        driver.navigate().back();
        
        driver.navigate().forward();
        
        driver.close();//close current browers
        driver.quit();//close all browser opened by selenium
	}
}