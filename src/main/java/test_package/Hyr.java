package test_package;
import java.util.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class Hyr {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		System.out.println(driver.getCurrentUrl());
//		WebElement e = driver.findElement(By.id("post-body-299858861183690484"));
//		WebElement above = driver.findElement(RelativeLocator.with(By.tagName("label")).above(e));
//		System.out.println(above);
		WebElement a = driver.findElement(By.name("refreshbtn"));
		WebElement left = driver.findElement(RelativeLocator.with(By.tagName("input")));
		
		driver.close();
	}
}
