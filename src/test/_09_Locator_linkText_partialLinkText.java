package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ValidationMethods;

import java.util.concurrent.TimeUnit;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {

    /* TEST CASE 1:
    1. Go to https://www.google.com
    2. Validate the Gmail, Images, About and Store links are displayed and enabled
    */
        System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com");

        WebElement gmail = driver.findElement(By.linkText("About"));
        ValidationMethods.validateElementIsDisplayedAndEnabled(gmail, "Gmail link");

        WebElement images = driver.findElement(By.linkText("Images"));
        ValidationMethods.validateElementIsDisplayedAndEnabled(gmail, "Images link");

        WebElement about = driver.findElement(By.linkText("About"));
        ValidationMethods.validateElementIsDisplayedAndEnabled(gmail, "About link");

        WebElement store = driver.findElement(By.linkText("Store"));
        ValidationMethods.validateElementIsDisplayedAndEnabled(gmail, "Store link");

        driver.quit();

    }
}
