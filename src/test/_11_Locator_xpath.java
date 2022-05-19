package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _11_Locator_xpath {
    public static void main(String[] args) {

    /* TEST CASE 1:
    Go to https://www.google.com/
    Validate the links below at the bottom-left of the page using XPath
    Advertising
    Business
    How Search works
    */
        System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        List<WebElement> navLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']//a"));
        System.out.println(navLinks.size()); // 3

        String[] expectedLinkTexts = {"Advertising", "Business", "How Search works"};

        for (int i = 0; i < 3; i++) {
            if(navLinks.get(i).isDisplayed() && navLinks.get(i).isEnabled() && navLinks.get(i).getText().equals(expectedLinkTexts[i]))
                System.out.println(expectedLinkTexts[i] + " link validation is PASSED");
            else System.out.println(expectedLinkTexts[i] + " link validation is FAILED");
        }

        driver.quit();






    }
}
