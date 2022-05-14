package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {
        // TEST SCRIPT STEPS (EX):
        // 1. SET UP DRIVER
        System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver"); // this helps us defines which driver to use and provide path od the driver
        WebDriver driver = new ChromeDriver(); // instantiate ChromeDriver object

        // 2. MAXIMIZE DRIVER
        driver.manage().window().fullscreen(); // OR maximize(); here maximizing Chrome window; maximize to see all web elements. (FULLSCREEN != MAXIMIZE)
        // *** if this step isn't done then it'll have a smaller resolution therefore hiding some web elements ***

        // 3. DEFINE IMPLICIT WAITS
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // this needs to be done to SYNCHRONIZE them bc the source code is executes faster than selenium webdriver (jars).

        // NOTE: THE 4 LINE OF CODES ABOVE THIS COMMENT SHOULD BE DONE EVERYTIME YOU AUTOMATE A TEST CASE!

        // 4. NAVIGATE TO GOOGLE WEBSITE (Application)
        driver.get("https://www.google.com/");

        // 5. VALIDATE THE TITLE
        System.out.println("The title of the page is = " + driver.getTitle()); // EXPECTED: Google
        // driver.getTitle() --> is a return method type so should put in sout
        if(driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
        else System.out.println("Google title validation FAILED!!!");

        System.out.println("END OF THE PROGRAM");

        // 6. QUIT DRIVER
        //Thread.sleep(3000); // this is NEVER done as we want automation to be as quick as possible but this is for DEMO purposes
        driver.quit();




    }
}
