package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * https://www.tutorialspoint.com/how-to-take-screenshot-with-selenium-webdriver
 * 
 * TakeScreenShot is an interface that captures screenshots of the visible portion of the page. 
 * getScreenshotAs is a method which comes with the TakeScreenShot interface.
 */
public class H_TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize(); 
	    driver.manage().deleteAllCookies();
	    String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      // capture screenshot and store the image
	      File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(s, new File("tutorialpoint.png"));
	      driver.quit();

	}

}
