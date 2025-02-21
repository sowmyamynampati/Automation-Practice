package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Screenshots;

public class TC7_Screenshots {
	WebDriver driver;
	Screenshots fs;
	@BeforeClass
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/");
		fs= new Screenshots(driver);
	}
	@Test
	public void Screenshot() {
	/*	fs.FullpageScreenshot();  */
		fs.SpecificScetion() ;
		}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
