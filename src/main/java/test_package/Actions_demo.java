package test_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
public class Actions_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.get("https://omayo.blogspot.com/");
		WebElement blog = driver.findElement(By.id("blogsmenu"));
		act.moveToElement(blog).perform();
		WebElement opt = driver.findElement(By.xpath("//span[text()='Selenium143']"));
		act.moveToElement(opt).click().build().perform();
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		act.contextClick(search).perform();
		WebElement doub = driver.findElement(By.cssSelector("button[ondblclick='dblclickAlert()']"));
		act.doubleClick(doub).perform();
		
		driver.close();
		
		
		
	}

}
