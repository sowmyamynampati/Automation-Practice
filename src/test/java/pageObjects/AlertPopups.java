package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPopups {
	WebDriver driver;
	//constructor
	public AlertPopups(WebDriver driver) {
		this.driver= driver;
     PageFactory.initElements(driver,this);
		}
	
	//locators
	@FindBy(xpath="//*[@id='alertBtn']")
	WebElement Simplealert;
	@FindBy(id="confirmBtn")
	WebElement Confirmationalert;
	@FindBy(id="promptBtn")
	WebElement Promptalert;
	
	//action methods of alerts
	public void setaceptalert() throws InterruptedException {
		Simplealert.click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}
	public void setdismissalert() throws InterruptedException {
		Confirmationalert.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		}
	public void setpromptalert() throws InterruptedException {
		 Promptalert.click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		}
	
	
}
