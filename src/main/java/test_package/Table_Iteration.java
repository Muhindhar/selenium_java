package test_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Iteration {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int rowcount = rows.size();

		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']//tr[1]//th"));
		int colcount = cols.size();

		for(int r = 1; r <= rowcount; r++) {
			for(int c = 1; c <= colcount; c++) {
				if(r == 1) {
					System.out.print(driver.findElement(By.xpath("//table[@id='table1']//tr[" + r + "]//th[" + c + "]")).getText());
				} else {
					System.out.print(driver.findElement(By.xpath("//table[@id='table1']//tr[" + r + "]//td[" + c + "]")).getText());
				}
			}
		}
		driver.quit();
	}
}