package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _05_Locator_id {
    public static void main(String[] args) {

    /* TEST CASE 2:
    1. Go to https://www.techglobalschool.com
    2. Validate the company signature
    3. Logo must be displayed in the header section
    4. Company name must be displayed in the header section
    5. Company quote must be displayed in the header section
    */

        System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.techglobalschool.com");

        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));
        WebElement name = driver.findElement(By.id("comp-kuiqjidf"));
        WebElement quote = driver.findElement(By.id("comp-kuiqjidf1"));

        if(logo.isDisplayed()) System.out.println("The logo validation PASSED");
        else System.out.println("Logo validation FAILED!!!");

        if(name.isDisplayed() && name.getText().equals("TechGlobal")) System.out.println("The name validation is PASSED");
        else System.out.println("The name validation is FAILED!!!");

        if(quote.isDisplayed() && quote.getText().equals("OUR GOAL IS YOUR SUCCESS")) System.out.println("The quote validation is PASSED");
        else System.out.println("The quote validation is FAILED!!!");











        driver.quit();



    }
}
