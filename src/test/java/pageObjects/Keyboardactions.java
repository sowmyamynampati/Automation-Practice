package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Keyboardactions {
WebDriver driver;
Actions act;
//constructor
public Keyboardactions (WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
	act=new Actions(driver);
}
//Locators
@FindBy(xpath="//textarea[@id='inputText1']")
WebElement Textarea;

//Action Methods and Keyboardactions
public void Text(String Selenium) {
	Textarea.sendKeys(Selenium);
	//ctrl+A
	act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	//ctrl+c
	act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	//Tab shift to 2nd textarea
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	//ctrl+v
	act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	
}



}
