package Project;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
WebDriver driver;
WebDriverWait wait;

@BeforeClass
public void setUp()
{
driver=new FirefoxDriver();
wait=new WebDriverWait(driver,Duration.ofSeconds(10));
driver.get("https://alchemy.hguy.co/crm");

	
}
@Test(priority=1)
public void homePageTest() throws InterruptedException
{
	Assert.assertEquals(driver.getTitle(), "SuiteCRM");
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	driver.findElement(By.id("bigbutton")).click();
	Assert.assertEquals(driver.getTitle(), "SuiteCRM");
	WebElement ele=driver.findElement(By.xpath("//*[@id=\'grouptab_0\']"));
	ele.click();
	wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"))));
	
     // Step 2: Locate all the list items and store them
     // Adjust the locator for the options based on your web page
     List<WebElement> optionsList = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));

     // Step 3: Iterate through the options and click the desired one
     for (WebElement option : optionsList) {
    	 System.out.println(option.getText());
         if (option.getText().equals("Accounts")) {
             option.click();
             break; // Exit the loop once the correct option is found
         }
         
	//Select select=new Select(ele);
	//select.selectByContainsVisibleText("Accounts");
	//WebElement account=select.getFirstSelectedOption();
	//account.click();
	String  name = null;
	
	
    
	List<WebElement> oddraw = driver.findElements(By.xpath("//*[@id=\'MassUpdate\']/div[3]/table/tbody/tr"));
    System.out.println("odd row cell values: ");
   for(int i=1;i<=9;i+=2)
   {
    	  name = driver.findElement(By.xpath("//*[@id=\'MassUpdate\']/div[3]/table/tbody/tr[i]/td[3]")).getText();
   System.out.println(name);
        
       //driver.findElement(By.xpath("/html/body/div[4]/div/div[8]/div[2]/b[2]"));
       
        
    }
     }
}}

    // Print the text in the alert
    
	
	
	//System.out.println(driver.findElement(By.id("toolbar")).getCssValue("background-colour"));
	

