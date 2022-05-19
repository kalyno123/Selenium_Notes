package test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _13_Form_Exercise {
    public static void main(String[] args) {
    /*
    Go to https://www.techglobalschool.com/
    Scroll down to the bottom of the page
    Validate the Subscribe form:
    Validate “Subscribe” heading2 with its text
    Validate ”Stay up to date!” paragraph with its text
    Validate “Enter your first name” input box with its placeholder
    Validate “Enter your last name” input box with its placeholder
    Validate “Add your email” input box with its placeholder
    Validate “SUBSCRIBE” button with its text
     */
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement h2Subscribe = driver.findElement(By.cssSelector("#comp-keehv7pd1 span>span"));
        WebElement stayUpToDate = driver.findElement(By.cssSelector("#comp-keei0711 span>span"));
        WebElement enterFirstName = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement enterLastName = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement email = driver.findElement(By.id("input_comp-khwb0zsz"));
        WebElement subButton = driver.findElement(By.xpath("(//button[@data-testid='buttonElement'])[2]"));
       // WebElement subButton = driver.findElement(By.xpath("//span[text()='SUBSCRIBE']/.."));


        System.out.println(h2Subscribe.getText().equals("Subscribe") ? "Form header validation PASSED" : "Form header validation FAILED");
        System.out.println(stayUpToDate.getText().equals("Stay up to date!") ? "Form desc validation PASSED" : "Form desc validation FAILED");
        System.out.println(enterFirstName.getAttribute("placeholder").equals("Enter your first name") ? "First name input box validation PASSED" : "First name input box validation FAILED");
        System.out.println(enterLastName.getAttribute("placeholder").equals("Enter your last name") ? "Last name input box validation PASSED" : "Last name input box validation FAILED");
        System.out.println(email.getAttribute("placeholder").equals("Add your email") ? "Email input box validation PASSED" : "Email input box validation FAILED");
        System.out.println(subButton.isDisplayed() && subButton.isEnabled() && subButton.getText().equals("SUBSCRIBE") ? "Subscribe button validation PASSED" : "Subscribe button validation FAILED");


        Driver.quitDriver();


    }
}
