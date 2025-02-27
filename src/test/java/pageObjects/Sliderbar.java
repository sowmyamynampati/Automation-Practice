package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Point;

public class Sliderbar {
	WebDriver driver;
	Actions act;
	
	//Constructor
	public Sliderbar(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		this.act= new Actions(driver);
		}
//Locators
	@FindBy(xpath="//span[contains (@class, 'ui-slider-handle')]")  //div[@class='price-range-block']//span[1]
	WebElement Start;
	@FindBy(xpath="//div[@class='price-range-block']//span[2]")
	WebElement End;
	
	//ActionMethods
	public Point getLocationofminimumslider() {
		return  Start.getLocation();
	}
	
	public Point getLocationofmaximumslider() {
		 return  End.getLocation();
	}
	public void moveMiniumSliderlocation() {
	act.dragAndDropBy(Start,150,0).build().perform();
	}

	public void moveMaxiumSliderlocation() {
		act.dragAndDropBy(End,-100, 0).build().perform();
	}
}
