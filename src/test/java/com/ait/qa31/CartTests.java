package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickIcoLogin(By.cssSelector(".ico-login"));
        isLoginPresent();
    }
    @Test
    public void cartPositiveTest() {
        driver.findElement(By.xpath("//*[@href='/141-inch-laptop']")).click();
        driver.findElement(By.xpath("//*[@id='add-to-cart-button-31']")).click();
        Assert.assertTrue(isElementPresent(By.className("product-name")));
    }


}
