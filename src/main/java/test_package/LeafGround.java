package test_package;
import java.time.Duration;
import java.util.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGround {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node06o5x59vt3ud8110usfgd67cg614507711.node0");
		driver.findElement(By.xpath("//button[@id='j_idt87:j_idt89']"));
		System.out.println("Button clicked");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='j_idt87:j_idt90'] span[class='ui-button-text ui-c']")));
		button.click();
		System.out.println(button.getText());
		driver.close();
		
		
	}

}
