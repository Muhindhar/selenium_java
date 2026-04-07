package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		WebElement iframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframe);
		String Frame1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by locator : "+Frame1);
		
		driver.switchTo().defaultContent();
		String main = driver.findElement(By.xpath("//*[@id='framesWrapper']/h1")).getText();
		System.out.println("BAck to main page :" + main);
		
		driver.switchTo().frame(1);
		String Frame2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(Frame2);
		driver.close();
		
	}
}
