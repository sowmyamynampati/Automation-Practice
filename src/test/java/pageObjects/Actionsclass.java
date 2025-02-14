package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
public class Actionsclass {
	WebDriver driver;
	 WebDriverWait wait;
	//constructor
	public Actionsclass (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(30));
			}
   //Locators
	@FindBy(id="draggable")
	WebElement Drag;
	@FindBy(id="droppable")
	WebElement Drop;
	//Action Methods

	public void setdraganddrop() {
		Actions act= new Actions(driver);
		act.dragAndDrop(Drag,Drop).build().perform();
		wait.until(ExpectedConditions.visibilityOf(Drag));
	  wait.until(ExpectedConditions.visibilityOf(Drop));
	}
	 public boolean isDropped() {
	        return Drop.getText().contains("Dropped!");
	    }
	}
