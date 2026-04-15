package test_package;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Particular_ss {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		try {
			WebElement logo=driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[1]//span[1]//*[name()='svg']"));
		   File source=((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./SeleniumScreenshots/logo"+System.currentTimeMillis()+".png"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Screenshot taken");
	}

}
