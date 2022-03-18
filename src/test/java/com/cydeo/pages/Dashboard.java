package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[.='You do not have permission to perform this action.']")
    public WebElement warningMessageNoVehicleContractsAccess;
}
