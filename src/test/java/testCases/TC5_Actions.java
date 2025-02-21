package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove "chrome is being controlledby automated software
		driver= new ChromeDriver(options);
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
	
