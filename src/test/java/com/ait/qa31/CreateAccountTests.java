package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void createNewAccountPositiveTest() {

        clickOnIcoRegister();
        clickOnGender();
        fillContactForm(new Contact().setFirstName("Arman").setLastName("Hakobyan").setEmail("Arm1030@gm.com")
                        .setPassword("Ar*1020man"));
        clickOnRegisterButton();
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class='ico-logout']")));

    }
}
