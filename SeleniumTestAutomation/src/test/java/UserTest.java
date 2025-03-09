
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test


public class UserTest extends BaseTest {

    public  void loginSuccesful()
    {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();

        System.out.println("giriş yapıldı");

    }
    public void loginGoogleAccountSuccesful()
    {
        driver.findElement(By.className("google-login-btn")).click();
        driver.findElement(By.id("identifierId")).sendKeys(password);
        driver.findElement(By.xpath("//span[text()='Sonraki']")).click();

        //kodlar başarılı ancak test tarayıcısı olduğu için işlem devamını güvenli bulmuyor
        // o yüzden bug lı kodlara ÖRNEK OLMASI AMACIYLA tamamlamıyorum

    }






}