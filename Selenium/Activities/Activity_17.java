package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_17 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
        WebElement selected=driver.findElement(By.cssSelector("select.h-80"));
        
        Select multiselect=new Select(selected);
        multiselect.selectByVisibleText("HTML");
        for(int i=3;i<=5;i++)
        {
        	multiselect.selectByIndex(i);
        	
        }
        multiselect.selectByValue("nodejs");
        // Print the selected options
        List<WebElement> selectedOptions = multiselect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        
        		
}
}