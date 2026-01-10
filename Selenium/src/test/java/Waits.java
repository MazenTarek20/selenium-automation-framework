import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Waits {
    WebDriver driver;

    @Test
    public void implictWait(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("");
    }
}

