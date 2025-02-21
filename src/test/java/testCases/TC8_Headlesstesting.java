package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HeadlessTesting;

public class TC8_Headlesstesting {
	  
		public WebDriver driver;
		HeadlessTesting ht;
		
		@BeforeClass
		public void Setup() {
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--headless=new"); //Headless mode execution 
			driver=new ChromeDriver(options);    //
		    driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
		
			}
		
		@Test
		public void LoginTest()  {
			 ht = new HeadlessTesting(driver);
			 ht.setname("Sowmya");
			 ht.setemail("433sowmyareddy@gmail.com");
			 ht.setphone("+1 7373415898");
			 ht. setaddress("8637 ArrowWood Drive");
			 ht.Dayscheckbox();
			 ht.selectCountryByVisibleText("Canada");
			 ht.setfemaleclick();
			 ht.setcolors("Blue");
			 ht.setanimals("Dog");
			 ht.setstartdate("01/01/2025");
			 ht.setenddate("01/31/2025");
			 ht.setsubmit();
			Assert.assertEquals(driver.getTitle(),"Automation Testing Practice");
				}
	    @AfterClass
	public void teardown() {
	    	driver.quit();
	}
	}


