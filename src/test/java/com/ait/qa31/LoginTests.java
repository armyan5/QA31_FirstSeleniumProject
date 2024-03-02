package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void loginPositiveTest() {
        clickIcoLogin(By.cssSelector(".ico-login"));
        isLoginPresent();
    }

}
