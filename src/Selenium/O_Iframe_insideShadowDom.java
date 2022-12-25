package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O_Iframe_insideShadowDom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		driver.switchTo().frame("pact");
		
		//document.querySelector("#snacktime").shadowRoot.querySelector("#tea")
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement tea = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		tea.sendKeys("masala tea");
		
		WebElement Lunch = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		Lunch.sendKeys("Curdrice");
		
		
		
		

	}

}
