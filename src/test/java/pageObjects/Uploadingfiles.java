package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uploadingfiles {
	WebDriver driver;
	 WebDriverWait wait;
	//constructor
	public  Uploadingfiles(WebDriver driver) {
		this.driver= driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
		}
	//locators
	@FindBy(id="singleFileInput")
	WebElement SingleFile;
	@FindBy(xpath="//*[@id='multipleFilesInput']")
	WebElement MultipleFiles;
	
	//Action Methods
	public void setsinglefile(String filePath) {
		 wait.until(ExpectedConditions.visibilityOf(SingleFile));
		SingleFile.sendKeys(filePath);
		System.out.println("Upload success message displayed.");
		}
	 public void setmultiplefiles(String file1, String file2) {
		 wait.until(ExpectedConditions.visibilityOf(MultipleFiles)); 
	        String files = String.join("\n", file1, file2); // Join multiple file paths with a newline
	        MultipleFiles.sendKeys(files);
	        System.out.println("Upload success message displayed.");
	    }
	}
