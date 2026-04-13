package test_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

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
		List<WebElement> contactname = driver.findElements(By.xpath("//table[@id='myTable']/tr/td[2]"));
		int concount = contactname.size();
		System.out.println("Contact count : "+concount);
		for(WebElement name : contactname) {
			System.out.println(name.getText());
		}
		String ex = "tamil";
		
		int i=1;
		for(WebElement name : contactname) {
			if(name.getText().equals(ex)) {
				List<WebElement> act =  driver.findElements(By.xpath("//table[@id='myTable']/tr[" + i + "]"));
				for(WebElement row : act) {
					System.out.println(row.getText());
				}
			}
			i++;
		}
		System.out.println("Data not found");
		driver.quit();
	}

}
