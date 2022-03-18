package com.cydeo.tests;

import com.cydeo.pages.LoginPage;
import com.cydeo.pages.TopMenuPage;
import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.VyTrackUtils;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US01 extends TestBase {

    @Test
    public void tc1_store_manager() {
        topMenu = new TopMenuPage();
        VyTrackUtils.loginAsStoreManager();
        List<WebElement> topMenuLInks = new ArrayList<>(Arrays.asList(topMenu.dashboardLink, topMenu.fleetLink,
                topMenu.customersLink, topMenu.salesLink, topMenu.activitiesLink, topMenu.marketingLink,
                topMenu.reportsAndSegmentsLink, topMenu.systemLink));

        List<String> expectedModuleNames = new ArrayList<>(Arrays.asList(
                "Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"
        ));

        List<String> actualModuleNames = new ArrayList<>();
        for (WebElement each : topMenuLInks) {
            actualModuleNames.add(each.getText());
        }
        BrowserUtils.sleep(2);
        for (WebElement each : topMenuLInks) {

            Assert.assertTrue(each.isDisplayed());
        }
        Assert.assertEquals(actualModuleNames, expectedModuleNames);
    }

    @Test
    public void tc1_sales_manager() {
        topMenu = new TopMenuPage();
        VyTrackUtils.loginAsSalesManager();
        List<WebElement> dashboardLInks = new ArrayList<>(Arrays.asList(topMenu.dashboardLink, topMenu.fleetLink,
                topMenu.customersLink, topMenu.salesLink, topMenu.activitiesLink, topMenu.marketingLink,
                topMenu.reportsAndSegmentsLink, topMenu.systemLink));

        List<String> expectedModuleNames = new ArrayList<>(Arrays.asList(
                "Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"
        ));

        List<String> actualModuleNames = new ArrayList<>();
        for (WebElement each : dashboardLInks) {
            actualModuleNames.add(each.getText());
        }

        for (WebElement each : dashboardLInks) {
            Assert.assertTrue(each.isDisplayed());
        }
        Assert.assertEquals(actualModuleNames, expectedModuleNames);
    }

    @Test
    public void tc2_truck_driver() {
        topMenu = new TopMenuPage();
        VyTrackUtils.loginAsTruckDriver();
        List<WebElement> driver_dashboardLInks = new ArrayList<>(Arrays.asList(topMenu.fleetLink,
                topMenu.customersLink, topMenu.activitiesLink, topMenu.systemLink));

        List<String> expectedModuleNames = new ArrayList<>(Arrays.asList(
                "Fleet", "Customers", "Activities", "System"
        ));

        List<String> actualModuleNames = new ArrayList<>();
        BrowserUtils.sleep(2);
        for (WebElement each : driver_dashboardLInks) {
            actualModuleNames.add(each.getText());
        }

        for (WebElement each : driver_dashboardLInks) {
            Assert.assertTrue(each.isDisplayed());
        }
        Assert.assertEquals(actualModuleNames, expectedModuleNames);
    }

}

