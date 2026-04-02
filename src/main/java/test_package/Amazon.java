package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Amazon {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.in");

        System.out.println("Current url : " + driver.getCurrentUrl());

        
        if (driver.getCurrentUrl().contains("amazon.in")) {
            System.out.println("Correct URL");
        } 
        else {
            System.out.println("Wrong URL");
        }
        driver.navigate().to("https://www.flipkart.com");
        WebElement search = driver.findElement(By.id("q"));
        search.sendKeys("realme phone",Keys.ENTER);
        
        driver.navigate().to("https://www.amazon.in");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.className("nav-right")));
       System.out.println("Search box visible: " + searchBox.isDisplayed());
        
       //WebElement element = driver.findElement(By.className("nav-right"));
       //System.out.println("Navigation right visible : "+element.isDisplayed());
        driver.close();
    }
}