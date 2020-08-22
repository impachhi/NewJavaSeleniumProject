package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoRadioCheckbox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  //"C:\Selenium\chromedriver.exe"

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/radio.html");
        driver.findElement(By.id("vfb-7-1")).click(); //radio button 1 selected
        Thread.sleep(5000);
        System.out.println("Radio Button Selected");
        driver.findElement(By.id("vfb-6-0"));  //Check Box 1 selected
        driver.quit();
//        Im writing comment here to check it in git
    }
}
