package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div#frame1Wrapper"));
		
		System.out.println("Switched");
		driver.close();
		
	}

}
