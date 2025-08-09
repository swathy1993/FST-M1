package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Activity_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();

	        // Open the page
	        driver.get("https://training-support.net/webelements/tables");
	        // Print the title of the page
	        System.out.println("Page title: " + driver.getTitle());

	        // Print the number of columns
	        List<WebElement> col=driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
	        System.out.println("Number of columns: " + col.size());
	     // Print the number of rows
	        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
	        System.out.println("Number of rows: " + rows.size());

	        // Print the cells values of the third row
	        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
	        System.out.println("Third row cell values: ");
	        for(WebElement cell : thirdRow) {
	            System.out.println(cell.getText());
	            
	        }
	        driver.quit();
	        

	}

}
