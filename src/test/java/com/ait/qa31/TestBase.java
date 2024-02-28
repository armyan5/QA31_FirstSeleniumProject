package com.ait.qa31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
    }

    public void type(String text, String locator) {
        driver.findElement(By.cssSelector(locator)).clear();
        driver.findElement(By.cssSelector(locator)).sendKeys(text);
    }

    public void click(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void findElementByCss(String text) {
        driver.findElement(By.cssSelector(text));
    }

    public void findElementByXpath(String text) {
        driver.findElement(By.xpath(text));
    }

    public void fillContactForm(Contact user) {
        type(By.name("FirstName"), user.getFirstName());
        type(By.name("LastName"), user.getLastName());
        type(By.name("Email"), user.getEmail());
        type(By.name("Password"), user.getPassword());
        type(By.name("ConfirmPassword"), user.getPassword());
    }

    public void clickOnIcoRegister() {
        click(By.cssSelector(".ico-register"));
    }

    public void clickOnRegisterButton() {
        click(By.name("register-button"));
    }

    public void clickOnGender() {
        click(By.cssSelector("#gender-male"));
    }

    public void clickIcoLogin(String locator) {
        click(locator);
    }
}
