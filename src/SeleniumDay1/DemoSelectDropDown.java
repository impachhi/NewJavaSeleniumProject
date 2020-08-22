package SeleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelectDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");  //"C:\Selenium\chromedriver.exe"
        WebDriver driver = new ChromeDriver();
        try {

            driver.get("http://facebook.com");
            driver.findElement(By.id("u_0_2")).click();
            Thread.sleep(5000);
            WebElement bday=driver.findElement(By.name("birthday_day"));
            Select sc = new Select(bday);
//            Selection By Visible Text
            sc.selectByVisibleText("22");  //it will select 22 which is visible text need to give as input in the form of string
           WebElement day_selected= sc.getFirstSelectedOption();
           System.out.println(day_selected.getText());
           WebElement bmonth=driver.findElement(By.name("birthday_month"));
//           Selection By Index Value
            Select sc1 = new Select(bmonth);
            sc1.selectByIndex(8); //It will select Aug which is its index value
            WebElement selected_month=sc1.getFirstSelectedOption();
            System.out.println(selected_month.getText());

//            Selection By Value class

            WebElement byear=driver.findElement(By.name("birthday_year"));
            Select sc2 = new Select(byear);
            sc2.selectByValue("2020");  // It will select 2020
            WebElement year_selected=sc2.getFirstSelectedOption();
            System.out.println(year_selected.getText());
            System.out.println(day_selected.getText()+" "+selected_month.getText()+" "+year_selected.getText()); //22 Aug 2020 will be the output





        } finally {
            driver.quit();
        }
    }
}