package com.ait.qa31;

import org.testng.annotations.Test;


public class FindElementTestsHomework extends TestBase {


    @Test
    public void findElementByCssSelectorTest() {
        findElementByCss("a");
        findElementByCss("#topcartlink");
        findElementByCss("#small-searchterms");
        findElementByCss("#bar-notification");
        findElementByCss(".ico-register");
        findElementByCss(".header-logo");
        findElementByCss(".master-wrapper-content");
        findElementByCss("[href='/register']");
        findElementByCss("[href='/login']");
        findElementByCss("[href='/cart']");

    }

    @Test
    public void findElementByXpathTest() {
        findElementByXpath("//a");
        findElementByXpath("//*[@id='topcartlink']");
        findElementByXpath("//*[@id='small-searchterms']");
        findElementByXpath("//*[@id='bar-notification']");
        findElementByXpath("//*[@class='ico-register']");
        findElementByXpath("//*[@class='header-logo']");
        findElementByXpath("//*[@class='master-wrapper-content']");
        findElementByXpath("//*[@href='/register']");
        findElementByXpath("//*[@href='/login']");
        findElementByXpath("//*[@href='/cart']");
    }

}
