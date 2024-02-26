package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends TestBase{

    @Test
    public void loginPositiveTest() {
        driver.findElement(By.cssSelector(".ico-login")).click();

        driver.findElement(By.cssSelector(".email")).click();
        driver.findElement(By.cssSelector(".email")).clear();
        driver.findElement(By.cssSelector(".email")).sendKeys("Arm1029@gm.com");

        driver.findElement(By.cssSelector(".password")).click();
        driver.findElement(By.cssSelector(".password")).clear();
        driver.findElement(By.cssSelector(".password")).sendKeys("Ar*1020man");

        driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();

    }

    @Test
    public void cartPositiveTest() {
        loginPositiveTest();
        driver.findElement(By.xpath("//*[@href='/141-inch-laptop']")).click();
        driver.findElement(By.xpath("//*[@id='add-to-cart-button-31']")).click();
        Assert.assertTrue(isElementPresent(By.cssSelector(".product-name")));
    }
}
