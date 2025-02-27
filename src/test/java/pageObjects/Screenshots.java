package pageObjects;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshots {
	WebDriver driver;
	  WebDriverWait wait ;
	public Screenshots(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		}
	//Locators
	@FindBy(xpath="//div[contains(@class, 'product-grid')]")
	WebElement Featuredproducts;
	
//Full page screenshot and create Screenshots folder gave path
	 public void FullpageScreenshot() {
		TakesScreenshot ts= (TakesScreenshot)driver;
     File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	File targetfile= new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");  
	/* File targetfile= new File("C:\\SowmyaWorkspace\\AutomationPractice\\Screenshots\\fullpage.png"); */
   sourcefile.renameTo(targetfile);   //copy source file to target file 
	} 
	
	//Capturing the screenshot for specific section only in Selenium4 , webelement is also an interface
	public void SpecificScetion() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		    wait.until(ExpectedConditions.visibilityOf(Featuredproducts));
		File sourcefile=Featuredproducts.getScreenshotAs(OutputType.FILE);
		File targetfile= new File(System.getProperty("user.dir")+"\\Screenshots\\featuredProducts.png");
		sourcefile.renameTo(targetfile);
	}
}