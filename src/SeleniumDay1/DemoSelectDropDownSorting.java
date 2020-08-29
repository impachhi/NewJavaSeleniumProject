package SeleniumDay1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// demo program to  illustrate the sorting the select options (ascending or descending ) by in built methods
public class DemoSelectDropDownSorting {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
            Select sc=new Select(driver.findElement(By.id("first")));
            List <WebElement> list=sc.getOptions();
            List actual_listList=new ArrayList<>();
            for(WebElement ele:list) {
            	
            actual_listList.add(ele);

            }




        } finally {
            driver.quit();
        }
    }
}