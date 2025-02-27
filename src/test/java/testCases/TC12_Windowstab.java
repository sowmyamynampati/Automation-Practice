package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC12_Windowstab {
	 WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        ChromeOptions options = new ChromeOptions();
	        options.setAcceptInsecureCerts(true); // Accepts SSL Certificates

	        driver = new ChromeDriver(options);
	    	driver.get("https://demo.nopcommerce.com");
	    	driver.switchTo().newWindow(WindowType.TAB);
	    	driver.get("https://testautomationpractice.blogspot.com/");
	      driver.manage().window().maximize();
	    }

	    @Test
	    public void verifyTitle1() {
	        String expectedTitle1 = "nopCommerce demo store. Home page title"; // Correct expected title
	        String actualTitle1 = driver.getTitle();
	          Assert.assertEquals(actualTitle1, expectedTitle1, "Title Verification Failed");
	    }
@Test
	    public void verifyTitle2() {
	        String expectedTitle2 = "Automation Testing Practice"; // Correct expected title
	        String actualTitle2 = driver.getTitle();
	          Assert.assertEquals(actualTitle2, expectedTitle2, "Title Verification Failed");
	    }
	    @AfterClass
	    public void teardown() {
	        driver.quit();
	    }

}
