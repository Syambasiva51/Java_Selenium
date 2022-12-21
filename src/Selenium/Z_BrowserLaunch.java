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
	  ch.get("https://ui.freecrm.com/contacts");
	  ch.manage().window().maximize();
	  
	  //ch.findElement(By.id("userName")).sendKeys("Testuser12345");
	  //ch.findElement(By.id("password")).sendKeys("Testuser@12345");
	  //ch.findElement(By.xpath("//div[@class='mt-2 buttonWrap row']/div/button[@id='login']")).click();
	 	
	}
}
