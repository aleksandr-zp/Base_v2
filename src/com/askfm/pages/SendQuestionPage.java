package com.askfm.pages;

import com.qatestlab.base.BasePage;
import com.qatestlab.reporting.Reporter;


public class SendQuestionPage extends BasePage {

    public void openFriendForm(String friendName) {
        Reporter.log("Open friend's form");
        String URL = "http://ask.fm/" + friendName;
        driver.get(URL);
        waitForElementVisibility("massageTextArea");
    }

    public void typeQuestion(String questionText) {
        type("Type question", questionText, "massageTextArea");
    }

    public void clickAskButton() {
        clickAndWaitElementVisibility("Click on Ask button", "askButton", "conformationBox");
    }
}
