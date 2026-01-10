import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDown {
     WebDriver driver;

     @Test
    public void testDropDown(){
         driver = new FirefoxDriver();
         driver.manage().window().maximize();
         driver.get("https://the-internet.herokuapp.com/dropdown");
         By dropdown = By.id("dropdown");
         new Select(driver.findElement(dropdown)).selectByValue("2");

     }
}

