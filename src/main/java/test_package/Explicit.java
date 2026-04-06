package test_package;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class Explicit {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		 driver.findElement(By.cssSelector("input#timerButton"));
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement button  = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
		  button.click();
		  System.out.println("clicked");
		 System.out.println(driver.findElement(By.id("div#deletesuccess")).getText()); 
		  
		  WebElement b2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("input#alert2")));
		  b2.click();
		  System.out.println("2nd clicked");
		  
	}
}
