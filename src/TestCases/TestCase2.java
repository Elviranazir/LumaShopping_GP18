package TestCases;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase2 extends BaseDriver {
    @Test
    public void Test1() {

// Go to the site
        driver.get("https://magento.softwaretestingboard.com/");
// Click Sign In

        WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
        signIn.click();

        // Enter your Email & Password
        WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
        email.sendKeys("johnsnw@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id=\"pass\"][@name=\"login[password]\"]"));
        password.sendKeys("Jsnow123.1545656");

        WebElement signInButton = driver.findElement(By.xpath("//button[@type=\"submit\"][@class=\"action login primary\"]"));
        signInButton.click();

        // Confirm that your signed in on application successfully
        WebElement welcome = driver.findElement(By.xpath("//li[@class=\"greet welcome\"]/span[@class=\"logged-in\"][text()='Welcome, John Snow!']"));
        String welcometext = welcome.getText();
        if (welcometext.contains("Welcome, John Snow!")) {
            System.out.println("Test verificatin passed!");
        } else {
            System.out.println("Test verificatin failed!");
        }
        waitAndQuit();
    }


}

