import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JS {

    WebDriver driver;

    @Test
    public void test(){
        driver = new FirefoxDriver();
        driver.get("");
        ((JavascriptExecutor)driver).
                executeScript("arguments[0].scrollInView();" , driver.findElement(By.id("scroll_text")));
    }
}
