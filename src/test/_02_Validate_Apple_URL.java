package test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) {
    /* TEST CASE 2:
    1. Go to "https://www.apple.com/"
    2. Validate the URL of the page is displayed as "https://www.apple.com/"
    NOTE: driver.getCurrentUrl(); --> this line returns the URL of the current page as a String
    */

        //System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        //WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // ^^ THESE FOUR LINES OF CODE MUST ALWAYS BE DONE ^^

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.apple.com");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.apple.com";

        if (actualURL.equals(expectedURL)) System.out.println("URL testing PASS");
        else System.out.println("URL testing FAILED");

        //driver.quit();
        Driver.quitDriver();

    }




}
