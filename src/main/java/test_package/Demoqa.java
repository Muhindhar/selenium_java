package test_package;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//----handling windows---------

public class Demoqa {
	public static void main(String[] args) {
		int count=0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parent = driver.getWindowHandle();
		System.out.println("Parent Id : "+parent);
		
		Set<String> allwindowHandles = driver.getWindowHandles();
		System.out.println("Count of window : "+allwindowHandles);
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> newAllWindowHandles = driver.getWindowHandles();
		System.out.println("New count of window :" + newAllWindowHandles);
		
		String ParentHandle = driver.getWindowHandle();
		System.out.println("parent : "+ ParentHandle);
		
		Iterator<String> it = newAllWindowHandles.iterator();
		String main = it.next();
		String child = it.next();
		System.out.println("PArent : "+ main);
		System.out.println("Child : "+child);
		
		driver.switchTo().window(child);
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		driver.close();
		
		driver.switchTo().window(main);
		System.out.println("Parent title : "+driver.getTitle());
		driver.quit();
		
				
		
	}
}
