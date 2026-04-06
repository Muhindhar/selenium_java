package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.WebElement;

public class Goibibo {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[@role='presentation']")
            )).click();
        } catch (Exception e) {
            System.out.println("Popup not appeared");
        }
        System.out.println("Popup handled successfully");

//        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(
//			By.xpath("//div[@class='SearchBlock-styles__HSContainer-sc-9d9e42df-0 cSmlgf']/child::div[1]\r\n")));
//        search.click();
        
        WebElement Bus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@data-cy='submit']/*[contains(@class, 'primaryBtn') and contains(@class, 'widgetSearchBtn')]\r\n"
        		+ "")));
        Bus.click();
        System.out.println("Bus clicked");
        
        WebElement FromCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='fromCity']\r\n"
        		+ "")));
        System.out.println("From city Clicked");
        driver.quit();
    }
}