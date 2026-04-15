package test_package;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assessment1_Question {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.id("login2")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys("admin");
        driver.findElement(By.id("loginpassword")).sendKeys("admin");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        System.out.println("Logged in successfully");

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Laptops"))).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//div[@id='tbodyid']//h4/a")));

        List<WebElement> productList = driver.findElements(
                By.xpath("//div[@id='tbodyid']//h4/a"));

        Set<String> sortedProducts = new TreeSet<>();

        for (WebElement p : productList) {
            sortedProducts.add(p.getText());
        }

        System.out.println("Sorted Laptop List:");
        for (String name : sortedProducts) {
            System.out.println(name);
        }
        
        WebElement mac = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MacBook Pro")));
        
        Actions act = new Actions(driver);
        act.moveToElement(mac).perform();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",mac);
        System.out.println("Laptop : "+mac.getText());
        mac.click();
        
        WebElement cart = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart")));
        cart.click();
        
        wait.until(ExpectedConditions.alertIsPresent());
       Alert a = driver.switchTo().alert();
       a.accept();
       System.out.println("Product added to cart");
       WebElement viewcart = driver.findElement(By.xpath("//a[normalize-space()='Cart']"));
       viewcart.click();
       
       WebElement place = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
       place.click();
       
       WebElement name1 = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.id("name")));
       name1.sendKeys("Test User");
       WebElement country = driver.findElement(By.xpath("//input[@id='country']"));
       country.sendKeys("India");
       WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
       city.sendKeys("Salem");
       WebElement card = driver.findElement(By.xpath("//input[@id='card']"));
       card.sendKeys("54678907");
       WebElement month = driver.findElement(By.xpath("//input[@id='month']"));
       month.sendKeys("01");
       WebElement year = driver.findElement(By.xpath("//input[@id='year']"));
       year.sendKeys("2026");
       driver.findElement(By.xpath("//button[text()='Purchase']")).click();
       
       
        
       WebElement purchase = wait.until(
               ExpectedConditions.visibilityOfElementLocated(
                       By.xpath("//p[@class='lead text-muted ']")));
       String msg= purchase.getText();
       System.out.println(msg);
       
       if(msg.contains("Id")) {
    	   System.out.println("Ordered");
       }
       else {
    	   System.out.println("not ordered");
       }
       driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
       driver.quit();
    }
}