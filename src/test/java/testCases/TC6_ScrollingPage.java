package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.ScrollingPages;

public class TC6_ScrollingPage {
	WebDriver driver;
	ScrollingPages sp;
	@BeforeClass
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		sp= new ScrollingPages(driver);
			}
	@Test
	public void testscrolling() {
		sp.scrollDownByPixels(1000);
		}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	}
