package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    WebDriver ch=new ChromeDriver();
	    
	    ch.get("https://the-internet.herokuapp.com/dropdown");
		ch.manage().window().maximize();
		
		TakesScreenshot s = (TakesScreenshot)ch;
		File source = s.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/tutorialpoint.png"));
		

	}

}
