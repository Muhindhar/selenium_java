package test_package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.testim.io/");
    TakesScreenshot screenshot=(TakesScreenshot)driver;
    File source=screenshot.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(source,new File("./SeleniumScreenshots/Screen.png"));
    System.out.println("Screenshot is captured");
    
	}

}
