package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize(); 
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://www.google.com/");
	    
	    driver.navigate().to("https://www.amazon.com/");
	    
	    
	    driver.navigate().back();
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().forward();
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().refresh();
	    

	}

}
