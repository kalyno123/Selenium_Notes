package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Tile {
    public static void main(String[] args) {

    /* TEST CASE 1:
    1. Go to "https://www.apple.com/"
    2. Validate the title of the page is displayed as "Apple"
    */
        // 1st: manual check = MATCH
        // 2nd: automate test case

        System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com/");

        if (driver.getTitle().equals("Apple")) System.out.println("ACTUAL RESULT MATCH EXPECTED RESULT");
        else System.out.println("ACTUAL RESULT DOESN'T MATCH EXPECTED RESULT");

        System.out.println("END OF THE PROGRAM");

        driver.quit();



    }
}
