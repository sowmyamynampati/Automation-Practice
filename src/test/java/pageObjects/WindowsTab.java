package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WindowsTab {
	WebDriver driver;
	//constructor 
	public WindowsTab (WebDriver driver) {
          this.driver=driver;
PageFactory.initElements(driver, this);
}
	
	  // Method to get page title
    public String getPageTitle1() {
        return driver.getTitle();
    }
	
    public String getPageTitle2() {
        return driver.getTitle();
    }

}
