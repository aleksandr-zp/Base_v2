package com.askfm.pages;


import com.qatestlab.base.BasePage;
import com.qatestlab.reporting.Reporter;
import org.openqa.selenium.By;

public class AccountPage extends BasePage {
    public void clickLogoutButton() {
        clickAndWaitElementVisibility("Click on Logout button", "logoutButton", "loginFormButton");
    }

    public int getCountQuestions() {
        Reporter.log("Get the number of questions");
        return Integer.parseInt(driver.findElement(By.id("inbox_menu_counter")).getText().trim());

    }

}
