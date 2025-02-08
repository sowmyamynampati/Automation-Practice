package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Uploadingfiles;

public class TC3_UploadFiles {
	WebDriver driver;
	Uploadingfiles uf;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		uf = new Uploadingfiles(driver);
		
      }
@Test
public void singlefileupload() {

	 String filePath = "C:\\Users\\jaswa\\Downloads\\apache-maven-3.9.9-bin";
   uf.setsinglefile(filePath);
 
}
@Test
public void multiplefilesupload() {
    String file1 = "C:\\Users\\jaswa\\Downloads\\apache-maven-3.9.9-bin"; 
    String file2 = "C:\\Users\\jaswa\\Downloads\\apache-maven-3.9.9-bin.zip";
    uf.setmultiplefiles(file1, file2);
}

@AfterClass
public void teardown() {
	driver.quit();
}
}
