package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticWebTable {
	
	WebDriver driver;
	 WebDriverWait wait;
	//constructor
	public StaticWebTable (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(30));
			}
  //Locators
	@FindBy(xpath="//table[@name='BookTable']//tr")      //Rows count 
	List<WebElement> Rows;
	@FindBy(xpath="//table[@name='BookTable']//th")       //Columns count  
	List<WebElement> Columns;
	@FindBy(xpath="//table[@name='BookTable']//tr[5]//td[1]")      //Specific row 
	WebElement Specificrow;
	
	
	//Action Methods
	public int getRowsCount() {
		return Rows.size();
	}
	public int getColumnsCount() {
		return Columns.size();
	}	
	public String  getSpecificRowCount() {
		return Specificrow.getText();
	}
	}
	
