package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _04_Locator_Class {
    public static void main(String[] args) {

    /* TEST CASE 1:
    Go to https://www.google.com
    Validate the search input box is displayed
    */
        // 1. SETUP DRIVER
        //System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebDriver driver = Driver.getDriver();

        // 2. VALIDATION
        driver.get("https://www.google.com");

        // MAKING SURE THAT IMAGE IS DISPLAYED
        WebElement googleImage = driver.findElement(By.className("lnXdpd"));

        if(googleImage.isDisplayed()) System.out.println("Google image validation = PASSED");
        else System.out.println("Google image validation = FAILED");

        // 3. TEARDOWN
        //driver.quit();

        Driver.quitDriver();





    }
}
