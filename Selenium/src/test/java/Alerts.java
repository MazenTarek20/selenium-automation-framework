import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Alerts {
    WebDriver driver;
    By jsAlert = By.cssSelector("[onclick=\"jsAlert()\"]");
    By jsConfirm = By.cssSelector("[onclick=\"jsConfirm()\"]");
    By jsPrompt = By.cssSelector("[onclick=\"jsPrompt()\"]");

    @Test
    public void jsConfirm(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(jsAlert).click();
        driver.switchTo().alert().accept();
    }

    @Test
    public void jsPrompt(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(jsPrompt).click();
        driver.switchTo().alert().sendKeys("Hello selenium");
        driver.switchTo().alert().accept();
       // new Actions(driver).sendKeys(Keys.ENTER).perform();
    }

    @Test
    public void jsDismiss(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(jsConfirm).click();
        driver.switchTo().alert().dismiss();
    }

    @Test
    public void jsAlert(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(jsAlert).click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText );

    }
}
