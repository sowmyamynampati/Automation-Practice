package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopups {
	WebDriver driver;
	WebDriverWait  wait;
	//constructor
	public AlertPopups(WebDriver driver) {
		this.driver= driver;
     PageFactory.initElements(driver,this);
     this.wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		}
	
	//locators
	@FindBy(xpath="//*[@id='alertBtn']")
	WebElement Simplealert;
	@FindBy(id="confirmBtn")
	WebElement Confirmationalert;
	@FindBy(id="promptBtn")
	WebElement Promptalert;
	
	//action methods of alerts
	public void setaceptalert()  {
		Simplealert.click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	}
	public void setdismissalert()  {
		Confirmationalert.click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		}
	public void setpromptalert()  {
		 Promptalert.click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		}
	
	
}
