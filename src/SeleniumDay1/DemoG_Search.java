package SeleniumDay1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoG_Search {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();       
        driver.get("http://google.com/");
        System.out.println(driver.getCurrentUrl());     // driver command or method for getting current url
        driver.findElement(By.name("q")).sendKeys("java");
//        List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descedant::div[@class='sbl1']"));
        List<WebElement>list1=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
        System.out.println(list1.size());
        driver.quit();
       


    }

}
