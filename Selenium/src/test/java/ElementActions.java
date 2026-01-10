import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.Test;

public class ElementActions {
    WebDriver driver;
    By username = By.id("email");
    By password = By.cssSelector("[type = \"password\"]");
    By loginButton = RelativeLocator.with(By.tagName("button")).below(password);
    By loginFields = new ByAll(By.id("username") , By.cssSelector("[type = \"password\"]"));

    //Test runner
    @Test
    public void login(){
        driver = new FirefoxDriver();
        maximize();
        navigateTo("https://www.facebook.com");
        type(username,"admin");
        type(password,"admin");
        clicking(loginButton);
    }

    @Test
    public void uploadFileTC(){
        driver = new FirefoxDriver();
        maximize();
        navigateTo("");
    }

    public void type(By by, String text){
        clear(by);
        driver.findElement(by).sendKeys(text);
    }

    public void clear(By by){
        driver.findElement(by).clear();
    }

    public void clicking(By by){
        driver.findElement(by).click();
    }

    public WebElement findElement(By by){
        return driver.findElement(by);
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public void maximize(){
        driver.manage().window().maximize();
    }

}
