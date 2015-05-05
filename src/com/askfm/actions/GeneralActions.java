package com.askfm.actions;


import com.askfm.control.Pages;
import com.qatestlab.base.BaseActions;
import org.openqa.selenium.By;

public class GeneralActions extends BaseActions{
    public void login(String name, String password){
        Pages.loginPage().openMainPage();
        Pages.loginPage().clickOpenLoginFormButton();
        Pages.loginPage().typeLogin(name);
        Pages.loginPage().typePassword(password);
        Pages.loginPage().clickLoginButton();
    }
    public void logout(){
        Pages.accountPage().clickLogoutButton();
    }
    public int getQuestionsCount(){
        return Pages.accountPage().getCountQuestions();
    }


    public void sendQuestion(String friendName, String questionText){
        Pages.sendQuestionPage().openFriendForm(friendName);
        Pages.sendQuestionPage().typeQuestion(questionText);
        Pages.sendQuestionPage().clickAskButton();
    }
}
