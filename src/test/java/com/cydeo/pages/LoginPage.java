package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public static WebElement usernameInputBox;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public static WebElement passwordInputBox;

    @FindBy(xpath = "//button[@id='_submit']")
    public static WebElement loginBtn;


    public void goToLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }


    public static void login(String username, String password){
        usernameInputBox.sendKeys(ConfigurationReader.getProperty(username));
       // BrowserUtils.sleep(2);
        passwordInputBox.sendKeys(ConfigurationReader.getProperty(password));
      //  BrowserUtils.sleep(2);
        loginBtn.click();



     }


}
