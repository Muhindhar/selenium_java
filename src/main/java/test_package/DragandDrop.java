package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		Actions act = new Actions(driver);
		WebElement drop = driver.findElement(By.cssSelector("div[id='form:drop_content']"));
		WebElement drag= driver.findElement(By.cssSelector("div[id='form:drag_content']"));
		act.dragAndDrop(drag, drop).perform();
		WebElement move = driver.findElement(By.cssSelector("div[id='form:conpnl_content']"));
		act.dragAndDropBy(move, 30,200).perform();
		System.out.println("moved");
		driver.close();
	}
}
