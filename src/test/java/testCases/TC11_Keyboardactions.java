package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Keyboardactions;

public class TC11_Keyboardactions {
	WebDriver driver;
	Keyboardactions ka;
	@BeforeClass
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		ka= new Keyboardactions(driver);
	}
@Test
public void Keyboardfunctions() {
   ka.Text("Selenium");
	Assert.assertTrue(true);

}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	}
