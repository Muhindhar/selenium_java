package test_package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicking_link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions act= new Actions(driver);
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		WebElement c = driver.findElement(By.linkText("compendiumdev"));
		//ctrl+enter key for clicking the link via keyboard
		act.keyDown(Keys.CONTROL).moveToElement(c).click().keyUp(Keys.CONTROL).build().perform();
		Set<String> wind = driver.getWindowHandles();
		for(String handles:wind) {
			driver.switchTo().window(handles);
		}
		Thread.sleep(3000);
		System.out.println("Child window : "+wind);
		driver.switchTo().window(parent);
		driver.quit();
	}

}
