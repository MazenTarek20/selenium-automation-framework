import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class BrowserOptions {
    WebDriver driver;

    @Test
    public void browserOptions(){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.setBrowserVersion("latest");
        driver = new FirefoxDriver(options);
        driver.get("https://www.google.com");
    }
}