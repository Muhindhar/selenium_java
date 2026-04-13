package test_package;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selecting_options {
	public static void main(String[] a) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0khs8ik5xi9in1odb14p9ym3lm14556593.node0");
		WebElement drop = driver.findElement(By.id("j_idt87:auto-complete_input"));
		String s="Appium";
		drop.sendKeys(s);
		drop.click();
		
		
		List<WebElement> op = driver.findElements(By.cssSelector(".ui-autocomplete-items.ui-autocomplete-list.ui-widget-content.ui-widget.ui-corner-all.ui-helper-reset li"));
		System.out.println(op.size());
		
//		for(WebElement o : op)
//		{
//			if(o.getText().equals(s) || o.getText().equals("AWS"))
//			{
//				o.click();
//				
//			}
//			
//		}
		List<String> sort = new ArrayList<>();
		for(WebElement o:op) {
			
			System.out.println(o.getText());
			
		}
		
		Collections.sort(sort);
		
		
		
		
		driver.close();

		
		
	}
}
