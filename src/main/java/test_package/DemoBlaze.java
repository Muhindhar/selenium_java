package test_package;
import java.time.Duration;
import java.util.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoBlaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement login = driver.findElement(By.cssSelector("#login2"));
		login.click();
		System.out.println("login clicked");
		
		WebElement inp = driver.findElement(By.cssSelector("input#loginusername"));
		inp.sendKeys("Muhindhar");
		WebElement pass = driver.findElement(By.cssSelector("input#loginpassword"));
		pass.sendKeys("muhi122181");
		WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginbtn.click();
		System.out.println("Loginbutton clicked");
		String name = "Welcome Muhindhar";
		String user = driver.findElement(By.cssSelector("#nameofuser")).getText();
		System.out.println(user);
		WebElement out = driver.findElement(By.cssSelector("#logout2"));
		WebElement logged = driver.findElement(By.xpath("//a[text()='Welcome Muhindhar']"));
		String a = logged.getText();
		if(a.equals(name)) {
			System.out.println("LoggedIn");
			System.out.println(a);
		}
		else {
			System.out.println("Not loggedIn");
		}
		driver.quit();
	}
}
