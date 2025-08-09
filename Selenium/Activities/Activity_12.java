package activities;



	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Activity_12 {
	    public static void main(String[] args) {
	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();
	        // Create the Wait object
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Open the page
	        driver.get("https://www.training-support.net/webelements/dynamic-content");
	        // Print the title of the page
	        System.out.println("Page title: " + driver.getTitle());
	         driver.findElement(By.id("genButton")).click();
	         wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
	         // Print the text to console
	            System.out.println("Word found: " + driver.findElement(By.id("word")).getText());
	        
	        // Close the browser
	        driver.quit();
	         
	    }
	}

