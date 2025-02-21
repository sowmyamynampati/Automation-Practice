package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HandleSSL {
	    WebDriver driver;

	    // Constructor
	    public  HandleSSL(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Method to get page title
	    public String getPageTitle() {
	        return driver.getTitle();
	    }
	}

