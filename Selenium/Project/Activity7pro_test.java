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

public class Activity7pro_test {
WebDriver driver;
WebDriverWait wait;

@BeforeClass
public void setUp()
{
driver=new FirefoxDriver();
wait=new WebDriverWait(driver,Duration.ofSeconds(5));
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
	WebElement ele=driver.findElement(By.id("grouptab_0"));
	Select select=new Select(ele);
	select.selectByContainsVisibleText("Leads");
	
	
    
	List<WebElement> lastcoloum = driver.findElements(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr/td[10]/span/span"));
    System.out.println("last row cell values: ");
    for(WebElement cell : lastcoloum) {
       cell.click();
       Alert promtAlert = driver.switchTo().alert();
       //driver.findElement(By.xpath("/html/body/div[4]/div/div[8]/div[2]/b[2]"));
       String alertText = promtAlert.getText();
       System.out.println("Text in alert: " + alertText);
       
        
    }
    

    // Print the text in the alert
    
	
	
	//System.out.println(driver.findElement(By.id("toolbar")).getCssValue("background-colour"));
	
}
}
