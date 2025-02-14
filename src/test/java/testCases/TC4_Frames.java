package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Frames;

public class TC4_Frames {
	WebDriver driver;
	Frames f;
	
	@ BeforeClass
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		f= new 	Frames(driver);
	}

@Test
public void frames() {
	f.setframe1("Hello");
	f.setframe2("Selenium");
	f.setframe3("Java");
	f.setframe4("Congratulations");
	}

@AfterClass
public void teardown() {
	driver.quit();
}
}
