package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void createNewAccountPositiveTest() {

        //Register
        driver.findElement(By.cssSelector(".ico-register")).click();

        //gender-male
        driver.findElement(By.cssSelector("#gender-male")).click();

        //FirstName
        driver.findElement(By.name("FirstName")).click();
        driver.findElement(By.name("FirstName")).clear();
        driver.findElement(By.name("FirstName")).sendKeys("Arman");

        //LastName
        driver.findElement(By.name("LastName")).click();
        driver.findElement(By.name("LastName")).clear();
        driver.findElement(By.name("LastName")).sendKeys("Hakobyan");

        //Email
        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("Arm1029@gm.com");

        //Password
        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("Ar*1020man");

        //ConfirmPassword
        driver.findElement(By.name("ConfirmPassword")).click();
        driver.findElement(By.name("ConfirmPassword")).clear();
        driver.findElement(By.name("ConfirmPassword")).sendKeys("Ar*1020man");

        //register-button
        driver.findElement(By.name("register-button")).click();

        //assert
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class='ico-logout']")));

    }

}
