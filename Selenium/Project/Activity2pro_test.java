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

public class Activity2pro_test {
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
public void homePageTest()
{
	Assert.assertEquals(driver.getTitle(), "SuiteCRM");

WebElement header = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img"));

//printing the header text
System.out.println("Header image is: " + header.getAttribute("src"));

}

@AfterClass
public void tearDown()
{
	driver.quit();
}
}