package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        clickIcoLogin(".ico-login");
        clickIcoLogin(".email");
        type("Arm1030@gm.com", ".email");
        clickIcoLogin(".password");
        type("Ar*1020man", ".password");
        clickLoginButton();
    }

    @Test
    public void cartPositiveTest() {
        loginPositiveTest();
        driver.findElement(By.xpath("//*[@href='/141-inch-laptop']")).click();
        driver.findElement(By.xpath("//*[@id='add-to-cart-button-31']")).click();
        Assert.assertTrue(isElementPresent(By.className("product-name")));
    }
}
