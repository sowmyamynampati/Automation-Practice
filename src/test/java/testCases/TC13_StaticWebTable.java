package testCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.StaticWebTable;

public class TC13_StaticWebTable {
	WebDriver driver;
	StaticWebTable st;
	@BeforeClass
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		st= new StaticWebTable(driver);
		}
         @Test
         public void StaticTable() {
        	int rowcount = st.getRowsCount();
        	System.out.println("Total rows:"+ rowcount );
        	int columncount=  st.getColumnsCount();
        	System.out.println("Total columns:"+ rowcount );
        	String specificrow= st.getSpecificRowCount();
        	System.out.println("bookname");
        	 }
    @AfterClass
	public void teardown() {
		driver.quit();
	}
	}
