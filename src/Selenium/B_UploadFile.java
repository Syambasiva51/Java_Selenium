package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_UploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://html.com/input-type-file/");
	    Thread.sleep(5000);
	    driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\samba\\Downloads\\Down.html");

	}

}
