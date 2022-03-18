package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPage {

    public TopMenuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Dashboard Link
    @FindBy(xpath = "//div[@id='main-menu']/ul/li/a/span[contains(text(),'Dashboard')]")
    public WebElement dashboardLink;

    //Fleet Menu
    @FindBy(xpath ="//div[@id='main-menu']//a/span[contains(text(),'Fleet')]")
    public WebElement fleetLink;
    @FindBy(xpath = "//span[.='Vehicle Contracts']/../..")
    public WebElement vehicleContractsLink;

    //Customers Link
    @FindBy(xpath ="//div[@id='main-menu']/ul/li/a/span[contains(text(),'Customers')]")
    public WebElement customersLink;

    //Sales Link
    @FindBy(xpath ="//div[@id='main-menu']/ul/li/a/span[contains(text(),'Sales')]")
    public WebElement salesLink;

    //Activities Link
    @FindBy(xpath ="//div[@id='main-menu']/ul/li/a/span[contains(text(),'Activities')]")
    public WebElement activitiesLink;

    //Marketing Link
    @FindBy(xpath ="//div[@id='main-menu']/ul/li/a/span[contains(text(),'Marketing')]")
    public WebElement marketingLink;

    //Reports & Segments Link
    @FindBy(xpath ="//div[@id='main-menu']/ul/li/a/span[contains(text(),'Report')]")
    public WebElement reportsAndSegmentsLink;

    //System Link
    @FindBy(xpath ="//div[@id='main-menu']/ul/li/a/span[contains(text(),'System')]")
    public WebElement systemLink;

}
