package Project;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Actrivity5pro_test {
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
	Thread.sleep(3000); 
	Assert.assertEquals(driver.findElement(By.id("toolbar")).getCssValue("background-colour"), "rgb(246, 245, 229)");
	System.out.println(driver.findElement(By.id("toolbar")).getCssValue("background-colour"));
	


}


}
