package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class N_HandleHiddenDrop_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("macbook pro ");
		Thread.sleep(5000);

		List<WebElement> suggList = driver.findElements(By.xpath("//div[contains(@class,'lrtEPN')]"));
		
		for(WebElement e : suggList) {
			System.out.println(e.getText());
		}
	}

}
