package com.ait.qa31;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        if (!isLoginLinkPresent()) ;
    }

    @Test
    public void createNewAccountPositiveTest() {

        clickOnIcoRegister();
        clickOnGender();
        fillContactForm(new Contact().setFirstName("Arman").setLastName("Hakobyan").setEmail("Arm10309@gm.com")
                .setPassword("Ar*1020man"));
        clickOnRegisterButton();
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class='ico-logout']")));

    }

    @DataProvider
    public Iterator<Object[]> addAccountFromCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/Account.csv")));

        String line = reader.readLine();

        while (line != null) {

            String[] split = line.split(",");

            list.add(new Object[]{new Contact().setFirstName(split[0]).setLastName(split[1])
                    .setEmail(split[2]).setPassword(split[3])});
            line = reader.readLine();
        }

        return list.iterator();
    }

    @Test(dataProvider = "addAccountFromCSV")
    public void createNewAccountPositiveTestFromDataProviderWithFile(Contact contact) {

        clickOnIcoRegister();
        clickOnGender();
        fillContactForm(contact);
        clickOnRegisterButton();
        Assert.assertTrue(isElementPresent(By.xpath("//*[@class='ico-logout']")));

    }
}
