package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
	//locators
	@FindBy(xpath="//strong[normalize-space()='News']")
	WebElement News;

	WebElement Vote;
	// Scroll down the page by a specific number of pixels
    public void scrollDownByPixels(int pixels) {
        js.executeScript("window.scrollBy(0,1000 )");
        System.out.println(js.executeScript ("return window.pageYOffset;"));
    }
    // scroll the page till element is visible 
    public void Elementvisible() {
    js.executeScript("arguments[0].scrollIntoView();",News);
    System.out.println(js.executeScript ("return window.pageYOffset;"));
	}
     //scroll the page till end
    public void Tillendofthepage() {
        js.executeScript("window.scrollBy(0,document.body.scrollHeight )");
        System.out.println(js.executeScript ("return window.pageYOffset;"));
    	}
}