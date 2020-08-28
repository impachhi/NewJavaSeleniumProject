package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class DemoGetattribute {
	@Test
	void google() {
		
		// demo getText() vs getAttribute() methods to get same result and diff results
		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.setHeadless(true);
	        WebDriver driver= new ChromeDriver(options);
	        
	        driver.get("https://www.javatpoint.com/python-tutorial") ;
	        System.out.println(driver.findElement(By.xpath("//h1[@class='h1']")).getText()); //Python Tutorial
	        System.out.println(driver.findElement(By.xpath("//h1[@class='h1']")).getAttribute("value")); //null
	        System.out.println(driver.findElement(By.xpath("//h1[@class='h1']")).getAttribute("textcontent")); //null
	        System.out.println(driver.findElement(By.xpath("//h1[@class='h1']")).getAttribute("innerHTML"));  //Python Tutorial
	        
	        
	        driver.quit();
	 
	}
	
}
