package test_package;
import java.time.Duration;

import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.findElement(By.cssSelector("input#adder")).click();
		System.out.println("clicked");
		WebElement a = driver.findElement(By.cssSelector("div#box0"));
		System.out.println(a.getCssValue("background-color"));
		

		
		
		
		
		driver.close();
	}

}
