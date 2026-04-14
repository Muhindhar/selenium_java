package test_package;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testim.io/");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new file("./SeleniumScreenShots/Screen.png"));
		System.out.println("Screenshot is captured");
		driver.quit();
	
	}

}
