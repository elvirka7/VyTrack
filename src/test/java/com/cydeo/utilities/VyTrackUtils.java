package com.cydeo.utilities;

import com.cydeo.pages.LoginPage;
import com.cydeo.tests.base.TestBase;

public class VyTrackUtils {



    public static void loginAsTruckDriver(){
     LoginPage.login("truck_driver_username", "password");
   }

    public static void loginAsStoreManager(){
        LoginPage.login("store_manager_username","password");
    }

    public static void loginAsSalesManager(){
        LoginPage.login("sales_manager_username","password");
    }

}
