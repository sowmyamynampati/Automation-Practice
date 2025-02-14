package testCases;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AlertPopups;

public class TC2_AlertPopups {
public WebDriver driver;
AlertPopups ap;

@BeforeClass
public void Setup() {
driver= new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
ap= new AlertPopups(driver);

}
@Test
	public void Alerts()  {
		ap.setaceptalert();
		ap.setdismissalert();
		ap.setpromptalert() ;
	}
	@AfterClass
	public void Teardown()  {
	driver.close();
	}
}
