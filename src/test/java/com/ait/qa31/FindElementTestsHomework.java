package com.ait.qa31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementTestsHomework {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void findElementByCssSelectorTest() {
        driver.findElement(By.cssSelector("a"));
        driver.findElement(By.cssSelector("#topcartlink"));
        driver.findElement(By.cssSelector("#small-searchterms"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector(".ico-register"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector(".master-wrapper-content"));
        driver.findElement(By.cssSelector("[href='/register']"));
        driver.findElement(By.cssSelector("[href='/login']"));
        driver.findElement(By.cssSelector("[href='/cart']"));

    }

    @Test
    public void findElementByXpathTest() {
        driver.findElement(By.xpath("//a"));
        driver.findElement(By.xpath("//*[@id='topcartlink']"));
        driver.findElement(By.xpath("//*[@id='small-searchterms']"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[@class='ico-register']"));
        driver.findElement(By.xpath("//*[@class='header-logo']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-content']"));
        driver.findElement(By.xpath("//*[@href='/register']"));
        driver.findElement(By.xpath("//*[@href='/login']"));
        driver.findElement(By.xpath("//*[@href='/cart']"));
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}
