package test_package;
import java.util.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkedIn {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
		System.out.println("Success");
		driver.findElement(By.cssSelector("a.nav__button-secondary")).click();
		System.out.println("Clicked signup");
		driver.findElement(By.cssSelector("div a#join_now")).click();
		System.out.println("Clicked");
		driver.findElement(By.cssSelector("div input#email-or-phone")).sendKeys("jeevapranesh.vrp@gmail.com");
		System.out.println("Name entered");
		driver.findElement(By.cssSelector("div input#password")).sendKeys("Jeeva@1101");
		System.out.println("Jeeva entered");
		driver.findElement(By.cssSelector("input[id=':r4:']")).sendKeys("muhindhar");
		System.out.println("success");
		
//		driver.findElement(By.cssSelector("button#join-form-submit")).click();
//		System.out.println("Agree clicked");
		
//	 driver.findElement(By.cssSelector("a.nav__button-secondary")).click();
//	 System.out.println("Clicked signup");
//	 driver.findElement(By.cssSelector("div input#username")).sendKeys("hello@gmail.com");
//	 System.out.println("name entered");
//	 driver.findElement(By.cssSelector("div input#password")).sendKeys("Hello12345!");
//	 System.out.println("ENtered the password");
 	driver.close();
	}
}
