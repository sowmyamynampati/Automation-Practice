package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HeadlessTesting {
	WebDriver driver;
	//constructor 
public HeadlessTesting (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
		//locators
		@FindBy(xpath="//*[@id='name']")
		WebElement Name;
		@FindBy(id="email")
		WebElement Email;
		@FindBy(xpath="//input[@id='phone']")
		WebElement Phone;
		@FindBy(xpath="//*[@id='textarea']")
		WebElement Address;
		@FindBy(xpath="//*[@id='female']")
		WebElement Gender;
		 @FindBy(xpath="//input[@class='form-check-input' and @type='checkbox']")
		List<WebElement> Allcheckboxes;
		@FindBy(xpath= "//*[@id='country']")
		WebElement Dropdown;
	    @FindBy(id="colors")
	    WebElement Colors;
	    @FindBy(id="animals")
	    WebElement Animals;
	    @FindBy(id="datepicker")
	    WebElement Datepicker;
	    @FindBy(xpath="//*[@id='start-date']")
		WebElement StartDate;
	    @FindBy(xpath="//*[@id='end-date']")
	    WebElement Enddate;
	    @FindBy(className="submit-btn")
	    WebElement Submit;
	   
	    
	    //Action Methods
	    public void setname (String name) {
	    	Name.sendKeys(name);
	    	 }
		 public void setemail (String email ) {
	    	Email.sendKeys(email);
	    	}
	     public void setphone (String phone) {
	    	Phone.sendKeys( phone);
	    	 } 
	     public void setaddress (String address) {
	    	Address.sendKeys(address);
	    	 }  
	     public void setfemaleclick () {
	     	Gender.click();
	     	}
	   public void setcolors(String colors) {
	    	  Colors.sendKeys(colors);
	    	}
	    public void setanimals(String animal) {
	    	 Animals.sendKeys(animal);
	   	}
	     public void setstartdate(String start) {
	    	 StartDate.sendKeys(start);
	   	}
	     public void setenddate(String end) {
	    	 Enddate.sendKeys(end);
	   	}
	     public void setsubmit() {
	    	 Submit.click();
	   	}
		public void selectCountryByVisibleText(String country) {
			  Select select = new Select(Dropdown);
			         select.selectByVisibleText(country);
			     }
		   public void Dayscheckbox(){
		    	for(WebElement Checkbox: Allcheckboxes)
		    	{
		    		 Checkbox.click();
		    	}
		    	 }
		}
		 

