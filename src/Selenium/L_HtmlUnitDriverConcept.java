package Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class L_HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		
		driver.get("https://demoqa.com/text-box");
		
		System.out.println("Before login, title is:==="+ driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("london");
		
		
		System.out.println("after login, title is:==="+ driver.getTitle());
		

	}

}
