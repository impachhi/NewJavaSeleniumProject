package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFindElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        //demo orange HRM auto login using selenium java
        driver.get("http://opensource-demo.orangehrmlive.com/");
        System.out.println(driver.getCurrentUrl());     // driver command or method for getting current url
        // 1 Find element by id
        driver.findElement(By.id("txtUsername")).sendKeys("Admin ");   //locating element user name by id
        //2 Find element by name
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");  //locating element password by name
        //3 Find element by xpath
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(5000);
        // 4 Find element by class name
        //5 Find element by css selector
        // 6 Find element by tag name
        // 7 Find element by link
        // 8 Find element by partial link text

        driver.quit();


    }

}
