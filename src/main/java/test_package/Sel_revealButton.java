package test_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.*;
public class Sel_revealButton {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.findElement(By.cssSelector("input#reveal")).click();
		WebElement text = driver.findElement(By.cssSelector("input#revealed"));
		text.click();
		text.sendKeys("Muhindhar");
		System.out.println(text.getAttribute("value"));
		driver.close(); 
		
	}
}
