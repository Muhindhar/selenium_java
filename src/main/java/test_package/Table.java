package test_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> d =driver.findElements(By.xpath("//table[@id='table1']/thead"));
		for(WebElement s:d) {
			System.out.println(s.getText());
		}
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		for(WebElement m : data) {
			System.out.println(m.getText());
		}
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]"));
		for(WebElement row1 : row) {
			System.out.println(row1.getText());
		}
		
		
		System.out.println(driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]")).getText());
		
		List<WebElement> seccol = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
		for(WebElement col : seccol) {
			System.out.println("Second coloumn:"+col.getText());
		}
		
		List<WebElement> count = driver.findElements(By.xpath("//table[@id=table1]//tr"));
		List<WebElement> count1 = driver.findElements(By.xpath("//table[@id=table1]//td"));
		System.out.println("Total rows : "+count+count1);
		
		
		
		
	}

}
