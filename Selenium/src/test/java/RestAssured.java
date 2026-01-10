import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class RestAssured {
    WebDriver driver;


    @Test
    public void checkBrokenLinks(){{
        driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/broken_images");
        String src = driver.findElement(By.cssSelector("[src=\"asdf.jpg\"]")).getDomProperty("src");
        try {
            URL url = new URI(src).toURL();
            Response response = io.restassured.RestAssured.given().get(url);
            System.out.println(response.getStatusLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    }


    @Test
    public void checkBrokenImages(){
        {
            driver = new FirefoxDriver();
            driver.get("https://the-internet.herokuapp.com/broken_images");
            String src = driver.findElement(By.cssSelector("[src=\"asdf.jpg\"]")).getDomProperty("src");
            try {
                URL url = new URI(src).toURL();
                Response response = io.restassured.RestAssured.given().get(url);
                System.out.println(response.getStatusLine());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}
