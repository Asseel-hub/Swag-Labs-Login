package secondProjectAuto;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyLoginTestcases {
	
	WebDriver driver =  new ChromeDriver() ;
	@BeforeTest
	public void mySetUp() {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@Test
	public void myFirstTest() throws InterruptedException {
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		
		/*driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-onesie")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();

		*/
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	}

		
	
	
	


