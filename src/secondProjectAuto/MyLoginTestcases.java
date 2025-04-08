
package secondProjectAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyLoginTestcases {

    WebDriver driver;

    @BeforeTest
    public void mySetUp() {
        // مسار chromedriver (يجب تعديله حسب جهازك)
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void myFirstTest() throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();

        // تحقق من نجاح تسجيل الدخول
        assert driver.getCurrentUrl().contains("inventory");
    }

}


