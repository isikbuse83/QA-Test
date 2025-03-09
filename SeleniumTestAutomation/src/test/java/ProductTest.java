import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static java.lang.Thread.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductTest extends BaseTest{
    @Test

    public void ChooseFashionCategory() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
        sleep(3000);
        driver.findElements(By.className("itemContainer")).get(0).click();

    }
    @Test
   public void SearchProduct() throws InterruptedException
   {
       driver.findElement(By.id("email")).sendKeys(email);
       driver.findElement(By.id("password")).sendKeys(password);
       driver.findElement(By.id("loginButton")).click();
       sleep(3000);
       driver.findElement(By.id("productSearchForm")).click();
       driver.findElement(By.id("productSearchForm")).click();
       driver.findElement(By.id("productSearchForm")).sendKeys(text);

   }





}
