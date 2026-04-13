package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().	window().maximize();
		WebElement search = driver.findElement(By.name("search_query"));
		search.click();
		search.sendKeys("Software testing");
		driver.findElement(By.cssSelector("button[title='Search']")).click();
		driver.findElement(By.cssSelector(".video-stream.html5-main-video[tabindex='-1'][data-no-fullscreen='true']")).click();
		Thread.sleep(10000);
		driver.close();
		
	}

}
