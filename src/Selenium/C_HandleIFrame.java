package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.tutorialspoint.com/selenium-and-iframe-in-html

public class C_HandleIFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Freecrm@12345
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		    WebDriver driver=new ChromeDriver();
		    
		    driver.get("https://the-internet.herokuapp.com/frames");
		      // identify element and click
		      driver.findElement(By.partialLinkText("Nested")).click();
		      // switching to frame with frame name
		      driver.switchTo().frame("frame-bottom");
		      WebElement m = driver.findElement(By.cssSelector("body"));
		      System.out.println("Frame text: " +m.getText());
		      driver.close();

	}

}
