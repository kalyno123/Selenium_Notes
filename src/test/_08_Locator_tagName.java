package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _08_Locator_tagName {
    public static void main(String[] args) {
    /*Go to https://www.wikipedia.org/
    1. Validate the WIKIPEDIA heading1 is displayed
    2. Validate the WIKIPEDIA LOGO is displayed
    3. Validate the search input box is displayed
    4. Validate the search button is displayed
    5. Validate the search button is enabled
    */
        System.setProperty("webdriver.chromdriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.wikipedia.org/");

        WebElement heading1 = driver.findElement(By.tagName("h1")); // OR CAN BE: driver.findElement(By.xpath("//h1"));
        WebElement logo = driver.findElement(By.cssSelector(".central-featured-logo")); // OR CAN BE:By.classname="central-featured-logo"
        WebElement inputBox = driver.findElement(By.id("searchInput")); // OR CAN BE: driver.findElement(By.cssSelector("#searchInput"));
        WebElement searchButton = driver.findElement(By.className("pure-button")); // OR CAN BE: driver.findElement(By.cssSelector(".pure-button"));

        if (heading1.isDisplayed()) System.out.println("Validate the WIKIPEDIA heading1 is displayed = PASSED");
        else System.out.println("Validate the WIKIPEDIA heading1 is displayed = FAILED");

        if (logo.isDisplayed()) System.out.println("Validate the WIKIPEDIA LOGO is displayed = PASSED");
        else System.out.println("Validate the WIKIPEDIA LOGO is displayed = FAILED");

        if(inputBox.isDisplayed()) System.out.println("Validate the search input box is displayed = PASSED");
        else System.out.println("Validate the search input box is displayed = FAILED");

        if(searchButton.isDisplayed() && searchButton.isEnabled()) System.out.println("Validate the search button is displayed and enable = PASSED");
        else System.out.println("Validate the search button is displayed and enable = FAILED");

        driver.quit();



    }
}
