package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q_Automate_SVG_3Delements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		
		driver.get("http://debeissat.nicolas.free.fr/svg3d.php");
		Thread.sleep(5000);
		
		driver.switchTo().frame("svg_result");
		while(true)
		{
			
			List<WebElement> eleList =driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2']//*[local-name()='path' and contains(@id,face)]"));
			
			for(WebElement ele : eleList)
			{
				String text = null;
				text= ele.getAttribute("d");
				System.out.println(text);
			}
		}

	}

}
