package com.cydeo.tests;

import com.cydeo.pages.Dashboard;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.TopMenuPage;
import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import org.apache.commons.logging.Log;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class US04 extends TestBase{

    @Test (priority = 1)
    public void tc1_store_manager() {
        topMenu = new TopMenuPage();
        VyTrackUtils.loginAsStoreManager();
        BrowserUtils.sleep(2);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(topMenu.fleetLink).perform();

        topMenu.vehicleContractsLink.click();
        String expectedURL = "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract";
        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        Assert.assertEquals(actualURL, expectedURL);

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test (priority = 2)
    public void tc1_sales_manager() {
        topMenu = new TopMenuPage();
        VyTrackUtils.loginAsSalesManager();
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(topMenu.fleetLink).perform();

        topMenu.vehicleContractsLink.click();
        String expectedURL = "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract";
        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        Assert.assertEquals(actualURL, expectedURL);

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test (priority = 3)
    public void tc1_truck_driver() {
        topMenu = new TopMenuPage();
        VyTrackUtils.loginAsTruckDriver();
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(topMenu.fleetLink).perform();
        topMenu.vehicleContractsLink.click();

        Dashboard dashboard = new Dashboard();
        String expectedWarningMessage = "You do not have permission to perform this action.";
        String actualWarningMessage = dashboard.warningMessageNoVehicleContractsAccess.getText();
        System.out.println("actualWarningMessage = " + actualWarningMessage);
        Assert.assertEquals(actualWarningMessage, expectedWarningMessage);
    }
}
