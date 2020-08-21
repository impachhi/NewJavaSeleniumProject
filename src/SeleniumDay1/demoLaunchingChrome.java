package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoLaunchingChrome {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  //"C:\Selenium\chromedriver.exe"

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.google.com");
        System.out.println(driver.getCurrentUrl());
        driver.quit();


    }

}
