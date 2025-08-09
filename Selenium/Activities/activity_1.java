package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/");
		System.out.println("the  titleof page is: "+driver.getTitle());
		driver.findElement(By.linkText("About Us")).click();//chaining
		String title=driver.getTitle();
		System.out.println("the  new titleof page is: "+title);
		
		

	}

}
