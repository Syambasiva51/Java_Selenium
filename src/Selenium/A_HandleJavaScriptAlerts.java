package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * How to handle Alerts and Pop-ups?
 * 
 * we have to use Alert API to handle alerts. we have to switch
 * method name : driver.switchTo().alert(); 
 * after using the method will give the alert class object reference by using this reference
 * we can access all methods
 * 
 * Useful:
 */
public class A_HandleJavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		    WebDriver driver=new ChromeDriver();
		    
		    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		    driver.findElement(By.name("proceed")).click();
		    Thread.sleep(5000);
		    Alert alert = driver.switchTo().alert(); 
		    String text = alert.getText();
		    if(text.contentEquals("Please enter a valid user name"))
		    {
		    	System.out.println("Correct alert Message");
		    }
		    else
		    {
		    	System.out.println("in-Correct alert Message");
		    }
		       
		    alert.accept(); //click on ok button	        
	}
}
