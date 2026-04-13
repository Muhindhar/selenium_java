package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		WebElement fname = (WebElement) js.executeScript("return document.querySelector(\"input[type='text']\")");
		fname.sendKeys("muhindhar");
		WebElement lname = (WebElement)js.executeScript("return document.querySelector(\"input[maxlength='15']\")");
		lname.sendKeys("sv");
		WebElement email = (WebElement) js.executeScript("return document.querySelectorAll(\"input[type='text']\")[2]");
		email.sendKeys("hello123@gmail.com");
		WebElement pass = (WebElement) js.executeScript("return document.querySelectorAll(\"input[type='password']\")[0]");
		pass.sendKeys("12345678");
		WebElement repass = (WebElement) js.executeScript("return document.querySelectorAll(\"input[type='password']\")[1]");
		repass.sendKeys("12345678");
		WebElement reg = (WebElement) js.executeScript("return document.querySelector(\"button[type='submit']\")");
		reg.click();
		String s = driver.getCurrentUrl();
		if(s.contains("name=muhindhar")) {
			System.out.println("login success");
		}
		else {
			System.out.println("fail");
		}
		driver.quit();
	}
}
