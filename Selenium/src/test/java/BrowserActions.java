import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserActions {
    WebDriver driver;

    //Test Runner
    @Test
    public void testCase(){
        driver = new FirefoxDriver();
        maximize();
        navigateTo("https://www.google.com");
        driver.switchTo().newWindow(WindowType.TAB);
        quit();

    }
    // شرح ال Navigation
    public void navigateTo(String url){
         driver.navigate().to(url);
    }
    public void navigateBack(){
        driver.navigate().back();
    }
    public void navigateForward(){
        driver.navigate().forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }

    // شرح ال Manage
    public void maximize(){
        driver.manage().window().maximize();
    }
    //عايز ال browser يفتح فى الحته الفولانيه set position
    public void setPosition(int x, int y){
      //  Point point = new Point(100,100);
        driver.manage().window().setPosition(new Point(x,y));
    }

    // عايز الbroswer يفتح فى حجم حاجة معينة size
    public void setSize(int widht , int hieght){
        driver.manage().window().setSize(new Dimension(widht , hieght));
    }

    public void fullScreen(){
        driver.manage().window().fullscreen();
    }

    public void getCurrentUrl(){
    String  url =  driver.getCurrentUrl();
    System.out.println("Current url: " + url);
    }

    public void getTitle(){
       String title = driver.getTitle();
       System.out.println("Current page title: " + title);
    }
    public void getPageSource(){
      String source = driver.getPageSource();
      System.out.println("Source: " + source);
    }

    public void getWindowHandle(){
       String handle = driver.getWindowHandle();
       System.out.println("Handle: " + handle);
    }

    public void close(){
        driver.close();
    }

    public void quit(){
        driver.quit();
    }
}
