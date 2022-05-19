package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _12_sendKey_click_methods {
    public static void main(String[] args) {

    /* TASE CASE 2:
    Go to https://www.wikipedia.org/
    Search for “Tesla”
    Validate the main title of the page is “Tesla”
    NOTE: Use xpath or cssSelector to locate the web elements
    */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement searchBox = driver.findElement(By.cssSelector("#searchInput"));
        searchBox.sendKeys("Tesla", Keys.ENTER);

        WebElement title = driver.findElement(By.cssSelector("#firstHeading"));
        System.out.println(title.getText().equals("Tesla") ? "Tesla title validation = Passed" : "Tesla title validation = Failed");



        Driver.quitDriver();




    }
}
