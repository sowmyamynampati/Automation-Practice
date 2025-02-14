package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class Frames {
	WebDriver driver;
	//constructor
	public Frames (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
    //locators
	@FindBy(xpath="//frame[@src='frame_1.html']")
	WebElement Frame1;
	@FindBy(name="mytext1")
	WebElement InsideFrame1;
	@FindBy(xpath="//frame[@src='frame_2.html']")
	WebElement Frame2;
	@FindBy(name="mytext2")
	WebElement Insideframe2;
	@FindBy(xpath="//frame[@src='frame_3.html']")
	WebElement Frame3;
	@FindBy(name="mytext3")
	WebElement Insideframe3;
	
	@FindBy(xpath="//frame[@src='frame_4.html']")
	WebElement Frame4;
	@FindBy(name="mytext4")
	WebElement Insideframe4;
     //Action Methods
    public void setframe1(String Welcome) {
    	driver.switchTo().frame(Frame1);
    	InsideFrame1.sendKeys("Welcome");
    	driver.switchTo().defaultContent();
   	}
     public void setframe2(String Hello) {
	   driver.switchTo().frame(Frame2);
	   Insideframe2.sendKeys("Hello");
	   driver.switchTo().defaultContent();
	   }
     public void setframe3(String Selenium) {
  	   driver.switchTo().frame(Frame3);
  	   Insideframe3.sendKeys("Selenium");
  	 driver.switchTo().defaultContent();
  	   }
     
     public void innerframe() {
    	 driver.switchTo().frame(0);
     }
     public void setframe4(String Java) {
    	   driver.switchTo().frame( Frame4);
    	   Insideframe4.sendKeys("Java");
    	   driver.switchTo().defaultContent();
    	   }
      }
    






