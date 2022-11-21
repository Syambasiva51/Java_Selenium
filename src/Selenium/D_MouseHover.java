package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://www.spicejet.com/");
	    
	    Actions action = new Actions(driver);
	    
	    action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).build().perform();
	    
	    driver.findElement(By.xpath("//div[text()='SpiceMAX']")).click();
	    
		
			
	}

}
