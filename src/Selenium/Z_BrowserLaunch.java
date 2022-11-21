package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Z_BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver ch=new ChromeDriver();

	  //System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	  //WebDriver ch = new FirefoxDriver();
	  ch.get("https://the-internet.herokuapp.com/dropdown");
	  ch.manage().window().maximize();
	  
	  
	  //dropdown
	  WebElement el = ch.findElement(By.id("dropdown"));
	  Select sl = new Select(el);
	  sl.selectByIndex(1);
	  
	  //Alerts
	  
	  
	  
	  ch.close();

		
		
	}
}
