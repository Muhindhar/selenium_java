package test_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown_actions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0khs8ik5xi9in1odb14p9ym3lm14556593.node0");
		WebElement drop = driver.findElement(By.id("j_idt87:auto-complete_input"));
		drop.sendKeys("AWS");
		WebElement aws = driver.findElement(By.cssSelector(".ui-autocomplete-item.ui-autocomplete-list-item.ui-corner-all.ui-state-highlight"));
		act.moveToElement(aws).click().perform();
		
		
		
	}
}
