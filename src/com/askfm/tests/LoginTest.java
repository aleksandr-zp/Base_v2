package com.askfm.tests;


import com.askfm.control.Actions;
import com.qatestlab.base.BaseTest;
import com.qatestlab.utils.StaticProvider;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }

    @Test(dataProvider = "person1", dataProviderClass = StaticProvider.class)
    public void loginPassedTest(String name, String password) {
        Actions.generalActions().login(name, password);
    }

    @Test(dataProvider = "person2", dataProviderClass = StaticProvider.class)
    public void loginFailedTest(String name, String password) {
        Actions.generalActions().login(name, password);
    }

    @Test(dataProvider = "person3", dataProviderClass = StaticProvider.class, dependsOnMethods = {"loginFailedTest"})
    public void loginSkipedTest(String name, String password) {
        Actions.generalActions().login(name, password);
    }
}
