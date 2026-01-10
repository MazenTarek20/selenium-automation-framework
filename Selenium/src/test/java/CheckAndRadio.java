import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckAndRadio {
    WebDriver driver;
    By Checkbox1 = By.id("checkboxes");
    By radio = By.id("radiobutton");
    @Test
    public void checkBox(){
       driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/checkboxes");
       System.out.println("Checked: " + driver.findElement(Checkbox1).isSelected());
       driver.findElement(Checkbox1).click();
    }

    @Test
    public void Radio(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(radio).click();
    }

}
