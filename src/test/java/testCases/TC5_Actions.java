package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Actionsclass;

public class TC5_Actions {
	WebDriver driver;
	Actionsclass ac;
	@BeforeClass
	public void setup() {
		driver= new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.manage().window().maximize();
	  ac= new Actionsclass(driver);
	}
		@Test
	public void DragandDrop() {
		 ac.setdraganddrop();
		 Assert.assertTrue(ac.isDropped(),"Failed");
		}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
	
