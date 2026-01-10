import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Windows {
    WebDriver driver;
    By clickHere = By.cssSelector(".example > a");
    By newTab = By.tagName("h3");

    @Test
    public void windows(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(clickHere).click();
        System.out.println(driver.findElement(newTab).getText());
    }
}
