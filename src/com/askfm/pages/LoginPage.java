package com.askfm.pages;

import com.qatestlab.base.BasePage;
import com.qatestlab.reporting.Reporter;
import com.qatestlab.utils.Constants;


public class LoginPage extends BasePage {

    public void openMainPage(){
        Reporter.log("Open Ask.fm");
        driver.get(Constants.BASE_URL);
        waitForElementVisibility("loginFormButton");
    }
    public void clickOpenLoginFormButton() {
        clickAndWaitElementVisibility("Click on login box button", "loginFormButton", "loginForm");
    }
    public void typeLogin(String name){
        type("Type login", name, "loginInput");
    }
    public void typePassword(String password){
        type("Type password", password, "passwordInput");
    }
    public void clickLoginButton(){
        clickAndWaitElementVisibility("Click on login button", "loginButton", "logoutButton");
    }
}
