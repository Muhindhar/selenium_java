package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



public class Flipkart {
    public static void main(String[] args) {
    	 WebDriver driver = new FirefoxDriver(); 
    	//WebDriver driver = new ChromeDriver();
    	//WebDriver driver = new EdgeDriver();
    	//WebDriver driver = new SafariDriver();
    
    	 
    	
        driver.get("https://www.flipkart.com/");

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Title Length : " + title.length());
        String url = driver.getCurrentUrl();
        String exp = "https://www.flipkart.com/";
        if (exp.equals(url)) {
            System.out.println("It is correct URL");
        } else {
            System.out.println("Not a correct URL");
        }
        String page = driver.getPageSource();
        System.out.println("PAGE LENGTH : " + page.length());
        driver.quit();
    }
}