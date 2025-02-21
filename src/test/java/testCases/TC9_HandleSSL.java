package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC9_HandleSSL {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // Accepts SSL Certificates

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
    }

    @Test
    public void verifyTitle() {
        String expectedTitle = "expired.badssl.com"; // Correct expected title
        String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle, "SSL Page Title Verification Failed");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}