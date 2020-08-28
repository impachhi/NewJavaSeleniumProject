package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class DemoCloseVsQuit {
	@Test
	void demoCloseVsQuit() {
		
		// demo program to illustrate the diff b/w close and quit method
		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
	        WebDriver driver= new ChromeDriver();
	        driver.get("http://demo.automationtesting.in/Windows.html");
	        driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
	        
//	        driver.close();			// closes only current working window
	        driver.quit();   		// closes the all the tab and quit the browser
	 
	}
	
}
