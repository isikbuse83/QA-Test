import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;

public class FavoriteTest extends BaseTest{
    @Test
    public void favoriteTest() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
        sleep(3000);
        driver.findElement(By.id("productSearchForm")).click();
        driver.findElement(By.id("searchData")).sendKeys(text, Keys.ENTER);
       driver.findElements(By.cssSelector("[class='followBtn']")).get(0).click();

    }

}
