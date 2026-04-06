package test_package;
import java.time.Duration;
import java.util.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		System.out.println("website opened");
		driver.findElement(By.cssSelector("div button.dropbtn")).click();
		System.out.println("Clicked");
		driver.findElement(By.cssSelector("div#myDropdown")).click();
		driver.findElement(By.cssSelector("a[href='http://facebook.com']")).click();
		driver.close();

	}

}
