package com.cydeo.tests.base;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.TopMenuPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.apache.commons.logging.Log;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {


   public LoginPage loginPage;
    public TopMenuPage topMenu;
    @BeforeMethod
    public void setUp(){
        loginPage = new LoginPage();
        loginPage.goToLoginPage();
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
    /* WE TRIED TO USE TESTBASE AND IT ONLY PASSED ONE TEST IN ONE CLASS,
     SO WE SWITCHED BACK TO USING BEFORE AND AFTER METHODS IN EACH CLASS EACH TIME
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void setUp(){
        loginPage.goToLoginPage();
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

     */
}
