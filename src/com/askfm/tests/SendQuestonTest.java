package com.askfm.tests;

import com.askfm.control.Actions;
import com.qatestlab.base.BaseTest;
import com.qatestlab.utils.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SendQuestonTest extends BaseTest {
    private int countQuestionsBeforeSend;
    private int countQuestionsAfterSend;
    private String friendName = "qa3905test";
    private String questionText = "How are you?";

    @BeforeMethod
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }

    @Test(dataProvider = "personQuestions1", dataProviderClass = StaticProvider.class)
    public void countQuestionsBeforeTest(String name, String password) {
        Actions.generalActions().login(name, password);
        countQuestionsBeforeSend = Actions.generalActions().getQuestionsCount();
        Actions.generalActions().logout();
    }

    @Test(dependsOnMethods = {"countQuestionsBeforeTest"}, dataProvider = "personQuestions2", dataProviderClass = StaticProvider.class)
    public void sendMessageTest(String name, String password) {
        Actions.generalActions().login(name, password);
        Actions.generalActions().sendQuestion(friendName, questionText);
        Actions.generalActions().logout();
    }

    @Test(dependsOnMethods = {"sendMessageTest"}, dataProvider = "personQuestions1", dataProviderClass = StaticProvider.class)
    public void receiveMessageTest(String name, String password) {
        Actions.generalActions().login(name, password);
        countQuestionsAfterSend = Actions.generalActions().getQuestionsCount();
        Actions.generalActions().logout();
        Assert.assertTrue(countQuestionsAfterSend > countQuestionsBeforeSend, String.format("The question is not sent. Count questions before sending message is '%d' and after - is '%d' ", countQuestionsBeforeSend, countQuestionsAfterSend));
    }
}
