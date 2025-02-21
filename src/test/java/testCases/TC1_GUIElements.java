package testCases;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.GUIElements;

public class TC1_GUIElements  {
	public WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		}
	
	@Test
	public void LoginTest()  {
		GUIElements lp = new GUIElements(driver);
		lp.setname("Sowmya");
		lp.setemail("433sowmyareddy@gmail.com");
		lp.setphone("+1 7373415898");
		lp. setaddress("8637 ArrowWood Drive");
		lp.Dayscheckbox();
		lp.selectCountryByVisibleText("Canada");
		lp.setfemaleclick();
		lp.setcolors("Blue");
		lp.setanimals("Dog");
		lp.setstartdate("01/01/2025");
		lp.setenddate("01/31/2025");
		lp.setsubmit();
		Assert.assertEquals(driver.getTitle(),"Automation Testing Practice");
			}
    @AfterClass
public void teardown() {
    	driver.quit();
}
}



