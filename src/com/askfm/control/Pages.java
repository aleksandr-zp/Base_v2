package com.askfm.control;

import com.askfm.pages.AccountPage;
import com.askfm.pages.LoginPage;
import com.askfm.pages.SendQuestionPage;

/**
 * @author William
 */
public class Pages {
    private static LoginPage loginPage;
    private static SendQuestionPage sendQuestionPage;
    private static AccountPage accountPage;


    public static void setupPages() {
        loginPage = new LoginPage();
        sendQuestionPage = new SendQuestionPage();
        accountPage = new AccountPage();
    }


    public static LoginPage loginPage() {
        return loginPage;
    }

    public static SendQuestionPage sendQuestionPage() {
        return sendQuestionPage;
    }

    public static AccountPage accountPage() {
        return accountPage;
    }


}
