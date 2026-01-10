import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DynamicLocator {

    WebDriver driver;

    @Test
    public void DL(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/");
        chooseCategory("Contribute");
        chooseSubCategory("Code");
    }


    public void chooseSubCategory(String option){
        driver.findElement(By.xpath("//a[.='"+option+"']")).click();

}
    public void chooseCategory(String option){
        new Actions(driver).moveToElement(driver.findElement(By.xpath("//li[@class='dropdown'] //a[.='"+option+"']")))
                .perform();

    }
    }
