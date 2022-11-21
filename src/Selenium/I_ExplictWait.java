package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class I_ExplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Explict wait is only for a specific element
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize(); 
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    driver.get("https://www.facebook.com/" );
	    //driver.get("http://demo.guru99.com/test/guru99home/" );
	    clickon(driver, driver.findElement(By.xpath("//button[@type='submit91']")), 10);

	}
	
	public static void clickon(WebDriver driver,WebElement Element,int timeout) {
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(Element));
		Element.click();
	}

}
