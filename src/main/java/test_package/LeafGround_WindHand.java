package test_package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround_WindHand {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window : "+parent);
		driver.findElement(By.cssSelector("button[id='j_idt88:new'] span[class='ui-button-text ui-c']")).click();
		
		String tit = driver.getTitle();
		
		Set<String>allwin = driver.getWindowHandles();

		for(String bt : allwin) {
			if(tit.equals(driver.getTitle())) {
				driver.switchTo().window(parent);
			}
		}
		driver.findElement(By.xpath("//span[normalize-space()='Open with delay']")).click();
		
		driver.quit();
		}
}
