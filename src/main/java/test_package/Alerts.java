package test_package;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement show = driver.findElement(By.cssSelector("button[id='j_idt88:j_idt91'] span[class='ui-button-text ui-c']"));
		show.click();
		Alert sh = driver.switchTo().alert();
		sh.accept();
		System.out.println("Accepted");
		
		WebElement al = driver.findElement(By.cssSelector("button[id='j_idt88:j_idt93'] span[class='ui-button-text ui-c']"));
		al.click();
		Alert m = driver.switchTo().alert();
		Thread.sleep(2000);
		m.dismiss();
		
		WebElement text = driver.findElement(By.cssSelector("button[id='j_idt88:j_idt104'] span[class='ui-button-text ui-c']"));
		text.click();
		Thread.sleep(2000);
		text.sendKeys("Muhindhar");
		Alert t = driver.switchTo().alert();
		Thread.sleep(2000);
		t.accept();
				
	}

}
