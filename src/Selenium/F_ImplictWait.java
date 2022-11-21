package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_ImplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implicit wait applies for all elements of the page
		//two dynamic waits are avaliable --1.implict and 2.pageload (if page load in 10 sec rest of time will be ignored)
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    //driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	    driver.manage().window().maximize(); 
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	    
	    
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		System.out.println("Test");
		
		driver.quit();
	    
	    
	    
	}
}
