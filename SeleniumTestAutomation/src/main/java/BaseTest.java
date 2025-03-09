import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest extends Data{
    WebDriver driver;


    @BeforeMethod

      public  void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://www.n11.com/giris-yap");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }
//    @AfterMethod
//    public  void closeBrowser() {

//        driver.quit();
//
//    }




}
