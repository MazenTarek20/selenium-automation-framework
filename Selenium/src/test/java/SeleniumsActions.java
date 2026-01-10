import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumsActions {
    WebDriver driver;
    By rightElement = By.tagName("checkbox 2");
    By doubleElement = By.id("dbClickBtn");
    By avatar = By.cssSelector("[alt='User Avatar']");
    By drag = By.id("column-a");
    By drop = By.id("column-b");

    @Test
    public void checkBox(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(rightElement)).perform();
    }

    @Test
    public void Hover(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(avatar)).perform();
    }

    @Test
    public void doubleClick(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(doubleElement)).perform();
    }

    @Test
    public void dragAndDrop(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(drag), driver.findElement(drop)).perform();
    }

    @Test
    public void clickAndHold(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(drag))
                .moveToElement(driver.findElement(drop))
                .release()
                .perform();
    }

    @Test
    public void Keys(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(driver.findElement(By.id("target")),"mazen")
                .perform();

    }
}
