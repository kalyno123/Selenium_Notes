package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _10_Find_Element_VS_Elements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chromedriver", "/Users/ngo/IdeaProjects/Selenium_Intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        List<WebElement> navLinks = driver.findElements(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']//a"));
        System.out.println(navLinks.size()); // 6
        for (WebElement element : navLinks){
            System.out.println(element.getText());
            System.out.println(element.isDisplayed() && element.isEnabled());
        }





    }
}
