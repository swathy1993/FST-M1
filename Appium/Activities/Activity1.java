package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
//decalaration of driver
//decalre required object
AppiumDriver driver;
WebDriverWait wait;

@BeforeClass
public void setUp() throws MalformedURLException, URISyntaxException
{
	UiAutomator2Options options=new UiAutomator2Options();
	options.setPlatformName("android");
	options.setAutomationName("UiAutomator2");
	options.noReset();
	options.setApp("C:/Users/sreek/Downloads/Calculator.apk");
	
	//only for android
	//options.setAppPackage("");
	//options.setAppActivity("");
	//set  the server URL
	URL serverUrl=new URI("http://localhost:4723").toURL();
	
	//Initialize  the driver
	driver=new AndroidDriver(serverUrl,options);
	
}
@Test
public void multiplyTest() {
    // Perform the calculation
    driver.findElement(AppiumBy.id("digit_2")).click();
    driver.findElement(AppiumBy.accessibilityId("multiply")).click();
    driver.findElement(AppiumBy.id("digit_5")).click();
    driver.findElement(AppiumBy.accessibilityId("equals")).click();

   

    
}
@AfterClass
public void tearDown()
{
	driver.quit();
}

}

