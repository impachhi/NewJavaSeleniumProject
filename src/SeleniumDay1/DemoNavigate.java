package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class DemoNavigate {
	@Test
	void demoNavigateto() {
		
		// demo program to illustrate the navigate methods
		//navigate.to() navigate.forward() navigate.refresh()  navigate.backward()
		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.navigate().to("http://google.com");
	        System.out.println(driver.getTitle());
	        driver.navigate().back();
	        System.out.println(driver.getTitle());
	        driver.navigate().forward();
	        System.out.println(driver.getTitle());

	        driver.quit();   		
	 
	}
	
}
