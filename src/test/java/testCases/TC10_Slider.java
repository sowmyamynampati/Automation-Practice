package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pageObjects.Sliderbar;

public class TC10_Slider {
	WebDriver driver;
    Sliderbar  slider;
	@BeforeClass
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		  slider = new Sliderbar(driver);
	}
	@Test
	public void testSlider() {
		System.out.println("Intial Minimum Slider Location:" + slider.getLocationofminimumslider());
		System.out.println("Intial Maximum Slider Location:" + slider.getLocationofmaximumslider());
		
		slider.moveMiniumSliderlocation();
		slider.moveMaxiumSliderlocation();
		
		System.out.println("New Minimum Slider Location:" + slider.getLocationofminimumslider());
		System.out.println("New  Maximum Slider Location:" + slider.getLocationofmaximumslider());
		
}
	@AfterClass
	public void Teardown()  {
	driver.quit();
	}

	}