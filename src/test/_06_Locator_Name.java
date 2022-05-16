package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _06_Locator_Name {
    public static void main(String[] args) {

    /* TEST CASE 3:
    1. Go to https://www.google.com
    2. Validate the search input element is displayed in the middle of the page
    */
        System.setProperty("webdriver.chromdriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com");
        WebElement inputBox = driver.findElement(By.name("q"));

        if (inputBox.isDisplayed()) System.out.println("Input box validation = PASSED");
        else System.out.println("Input box validation = FAILED");

        driver.quit();




    }
}
