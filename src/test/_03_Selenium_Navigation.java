package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _03_Selenium_Navigation {
    public static void main(String[] args) {

    /*
    Go to https://www.techglobalschool.com
    Refresh the page
    Navigate to https://www.amazon.com/
    Navigate back to TechGlobal web site
    Navigate forward Amazon web site
    Validate the URL of the page
    Validate the title of the page


    EXPECTED RESULT:
    URL  = https://www.amazon.com/
    Title = Amazon.com. Spend less. Smile more.

     */
            //1. Set up driver
            System.setProperty("webdriver.chrome.driver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
            // or CAN BE System.setProperty("webdriver.chrome.driver", "chromedriver"); THIS WILL WORK BC PATH OF PROJECT AND DRIVER IS THE SAME
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            //2. Validation
            driver.get("https://www.techglobalschool.com");
            driver.navigate().refresh();
            driver.navigate().to("https://www.amazon.com/");
            driver.navigate().back();
            driver.navigate().forward();

            String expectedTitle = "Amazon.com. Spend less. Smile more.";
            String expectedURL = "https://www.amazon.com/";

            String actualTitle = driver.getTitle();
            String actualURL = driver.getCurrentUrl();

            if (actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
            else System.out.println("Title validation FAILED!!!");

            if (actualURL.equals(expectedURL)) System.out.println("URL validation PASSED");
            else System.out.println("URL validation FAILED!!!");

            //3. Quit driver
            //Thread.sleep(3000);
            driver.quit();



    }
}
