package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Iterator

public class J_HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1. alerts -- JavaScript Pop UP-- Alert API (accept, dismiss)
		//2. File Upload pop up -- Browse Button (type = file, sendKeys(path)
		//3. Browser Window Popup - Advertisement pop up (windowHandler API - getWindowHandles() )
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize(); 
	    driver.manage().deleteAllCookies();
	    driver.get("https://demoqa.com/browser-windows");
	    driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	    
	    Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id:"+ parentWindowId);
		
		
		String childWindowId = it.next();
		System.out.println("Child window id:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(1000);
		
		System.out.println("child window pop up title"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(1000);
		
		System.out.println("parent window title"+driver.getTitle());
		
		

	}

}
