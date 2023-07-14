package TestCases;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase1 extends BaseDriver {


    //Fill the form on Create New Customer Account page
    //Confirm that your account created successfully
    @Test
    public void Test1(){
        //Go to https://magento.softwaretestingboard.com/
       driver.get("//magento.softwaretestingboard.com/");

        //Click Create an Account
        driver.get("https://magento.softwaretestingboard.com/");
        WebElement account =driver.findElement(By.xpath("//a[text()='Create an Account']"));
        account.click();

        //Fill the form on Create New Customer Account page
        WebElement firstname = driver.findElement(By.cssSelector("input[id=\"firstname\"]"));
        firstname.sendKeys("John");

        WebElement lastname = driver.findElement(By.cssSelector("input[id=\"lastname\"]"));
        lastname.sendKeys("Snow");

        WebElement email = driver.findElement(By.cssSelector("input[id=\"email_address\"]"));
        email.sendKeys("johnsnw@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        password.sendKeys("Jsnow123.1545656");

        WebElement passwordconf = driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]"));
        passwordconf.sendKeys("Jsnow123.1545656");


        WebElement createAccount = driver.findElement(By.xpath("//button[@class='action submit primary']"));
        createAccount.click();

        WebElement message = driver.findElement(By.cssSelector("div[data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]"));
        String messagecheck = message.getText();
        if (messagecheck.contains("Thank you for registering with Main Website Store.")){
            System.out.println("Test verificatin passed!");
        }else {
            System.out.println("Test verificatin failed!");
        }
        //        waitAndQuit();
    }
}
