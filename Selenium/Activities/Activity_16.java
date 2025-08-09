package activities;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_16 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        WebElement selecteddrop=driver.findElement(By.xpath("//*[contains(@class,\"transition hover:shadow-lg\")]"));
        Select select=new Select(selecteddrop);

        // Select the second option using visible text
        select.selectByVisibleText("Two");
        // Print the selected option
        System.out.println("Second option: " + select.getFirstSelectedOption().getText());

        // Select the third option using index
        select.selectByIndex(3);
        // Print the selected option
        System.out.println("Third option: " + select.getFirstSelectedOption().getText());

        // Select the fourth option using value attribute
        select.selectByValue("four");
        // Print the selected option
        System.out.println("Fourth option: " + select.getFirstSelectedOption().getText());

        // Print all the options
        List<WebElement> allOptions = select.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
   
    }
}



