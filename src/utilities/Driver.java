package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /* "WHERE DO YOU USE OOP IN YOUR PROJECT?"
    - I USE ENCAPSULATION IN MY DRIVER UTIL CLASS. I HAVE A WEBDRIVER INSTANCE VARIABLE AS PRIVATE AND PROVIDE A PUBLIC GET METHOD FOR IT.
    - THIS CLASS IS ALSO IMPLEMENTING SINGLETON DESIGN PATTERN THAT ALLOWS NLY ONE WEBDRIVER TO BE INSTANTIATED AND USE ACROSS THE PROJECT.
    NOTE: WE USE SINGLETON DESIGN PATTERN TO
    */


    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){ // if driver is not create (empty) then create a driver object ... otherwise just return the already existing driver.
            System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){ // this method is to teardown driver completely
            driver.manage().deleteAllCookies(); // deleting stored data from session
            driver.quit();
            driver = null;
        }
    }



}
