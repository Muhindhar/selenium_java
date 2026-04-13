package test_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectClass {
	public static void main(String[] ars) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0khs8ik5xi9in1odb14p9ym3lm14556593.node0");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select drop = new Select(tool);
		List<WebElement> list1 = drop.getOptions();
		System.out.println("Size of dropdown : "+list1.size());
		for(WebElement is : list1) {
			System.out.println("Options are :" +is.getText());
		}
		Boolean multiple = drop.isMultiple();
		System.out.println(multiple);
		drop.selectByIndex(0);
		Thread.sleep(3000);
		drop.selectByIndex(4);
		Thread.sleep(3000);
		drop.selectByVisibleText("Playwright");	
		
		Thread.sleep(3000);
		drop.deselectAll();
		}
}
