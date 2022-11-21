package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    
	      String url = "https://jqueryui.com/droppable/";
	      driver.get(url);
	      driver.manage().window().maximize();
	      driver.switchTo().frame(0);
	      
	      WebElement source= driver.findElement(By.id("draggable"));
	      WebElement target= driver.findElement(By.id("droppable"));
	      
	      // dragAndDrop() method for dragging the element from source to //destination
	      Actions a = new Actions(driver);
	      Thread.sleep(5000);
	   
	      a.dragAndDrop(source, target).build().perform();
	      Thread.sleep(5000);
	      driver.quit();
	}
}
