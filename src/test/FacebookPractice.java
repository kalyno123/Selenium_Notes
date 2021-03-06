package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookPractice {
    public static void main(String[] args) {

    /* Create a new class called TestFacebook and validate below test case:
    Go to https://www.facebook.com/
    Validate the title of the page is “Facebook - Log In or Sign Up”
    Validate the URL of the page is “https://www.facebook.com/”
    Validate “facebook” logo is displayed
    Validate heading2 “Connect with friends and the world around you on Facebook.” is displayed
    Validate “Email or Phone Number” input box is displayed
    Validate “Password” input box is displayed
    Validate “Log In” button is displayed and enabled
    Validate “Forgot Password?” link is displayed
    Validate “Create New Account” button is displayed
    */
        System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        /*
        xpath --> //tagName[@attributeName = 'attributeValue'] ___ //img[@class = 'fb_logo _8ilh img']
        css   --> tagName[attributeName = 'attributeValue']    ___ img[class = 'fb_logo _8ilh img']

        WebElement fbLogo = driver.findElement(By.className("fb_logo"));
        WebElement fbLogo = driver.findElement(By.cssSelector(".fb_logo"));
        WebElement fbLogo = driver.findElement(By.xpath("//img[@class = 'fb_logo _8ilh img']"));
        WebElement fbLogo = driver.findElement(By.cssSelector("img[class = 'fb_logo _8ilh img']"));
        */

        try {
            driver.get("https://www.facebook.com/"); // get the website

            if (driver.getTitle().equals("Facebook - Log In or Sign Up"))
                System.out.println("Title validation = PASSED");
            else System.out.println("Title validation = FAILED");

            if (driver.getCurrentUrl().equals("https://www.facebook.com/"))
                System.out.println("URL validation = PASSED");
            else System.out.println("URL validation = FAILED");

            WebElement logo = driver.findElement(By.cssSelector(".fb_logo")); // driver.findElement(By.cssSelector("img[class='fb_logo'"));
            WebElement heading2 = driver.findElement(By.cssSelector("._8eso")); // (By.partialLinkText("Connect with friends"))
            WebElement email_Phone_InputBox = driver.findElement(By.id("email"));
            WebElement password_InputBox = driver.findElement(By.id("pass"));
            WebElement loginButton = driver.findElement(By.cssSelector("button[name = 'login']"));
            WebElement forgotPassword = driver.findElement(By.linkText("Forgot password?"));
            WebElement newAcctButton = driver.findElement(By.cssSelector("a[ajaxify = '/reg/spotlight/']"));

            if (logo.isDisplayed()) System.out.println("Logo validation = PASSED");
            else System.out.println("Logo validation = FAILED");

            if (heading2.isDisplayed()) System.out.println("Heading2 validation = PASSED");
            else System.out.println("heading2 validation = FAILED");

            if (email_Phone_InputBox.isDisplayed()) System.out.println("Email/Phone input box validation = PASSED");
            else System.out.println("Email/Phone input box validation = FAILED");

            if (password_InputBox.isDisplayed()) System.out.println("Password input box validation = PASSED");
            else System.out.println("Password input box validation = FAILED");

            if (loginButton.isDisplayed() && loginButton.isEnabled())
                System.out.println("Login button displayed and enabled validation = PASSED");
            else System.out.println("Login button displayed and enabled validation = FAILED");

            if (forgotPassword.isDisplayed()) System.out.println("Forgot password validation = PASSED");
            else System.out.println("Forgot password validation = FAILED");

            if (newAcctButton.isDisplayed()) System.out.println("New account button validation = PASSED");
            else System.out.println("New account button validation = FAILED");

            System.out.println("END OF THE PROGRAM");

        }finally {
            driver.quit();
        }






    }
}
