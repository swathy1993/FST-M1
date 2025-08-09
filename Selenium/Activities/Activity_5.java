package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("title of page is :" +driver.getTitle());
		driver.findElement(By.id("checkbox")).isDisplayed();
		driver.findElement(By.xpath("//button[contains(text(),'Toggle Checkbox')]")).click();
		System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());
		driver.quit();
		
		

	}

}
