package test_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//input[@id='email']"));
		login.sendKeys("muhindharsv27@gmail.com");
		WebElement ps = driver.findElement(By.xpath("//input[@id='password']"));
		ps.sendKeys("12345678");
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();

		List<WebElement> print = driver.findElements(By.xpath("//table[@id='myTable']/tr/td"));
		for(WebElement p : print) {
			System.out.println(p.getText());
		}
		
		
	}

}
