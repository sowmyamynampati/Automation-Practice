package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ScrollingPages {
	WebDriver driver;
	JavascriptExecutor js;
	//constructor
	public ScrollingPages (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		js=(JavascriptExecutor)driver;
		}
	// Scroll down the page by a specific number of pixels
    public void scrollDownByPixels(int pixels) {
        js.executeScript("window.scrollBy(0,1000 )");
        System.out.println(js.executeScript ("return window.pageYOffset;"));
    }
	}
