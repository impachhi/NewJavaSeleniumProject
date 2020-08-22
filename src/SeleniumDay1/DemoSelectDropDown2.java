package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

// demo program to  illustrate the display the available the options
public class DemoSelectDropDown2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("http://facebook.com");
            driver.findElement(By.id("u_0_2")).click();
            Thread.sleep(5000);
            WebElement b_month=driver.findElement(By.name("birthday_month"));
            Thread.sleep(5000);
            Select sc1 = new Select(b_month);

            List<WebElement> availiableBdayMonths=sc1.getOptions();
            for(WebElement months:availiableBdayMonths){
                System.out.println(months.getText());


            }




        } finally {
            driver.quit();
        }
    }
}