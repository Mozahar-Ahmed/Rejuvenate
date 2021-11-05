package com.ebay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.ExtentTestManager;

public class LoginPage {
    @FindBy(id = "switch-account-anchor")
    private WebElement switchAccountBtn;
    @FindBy(id = "userid")
    private WebElement useridField;
    @FindBy(id = "signin-continue-btn")
    private WebElement signinContinueBtn;
    @FindBy(id = "pass")
    private WebElement passwordField;
    @FindBy(id = "sgnBt")
    private WebElement signinBtn;

    public void clickOnSwitchAccountButton() {
        switchAccountBtn.click();
    }

    public void typeOnUseridField(String userid) {
        useridField.sendKeys(userid);
        ExtentTestManager.log("User id typed on field");
    }

    public void clickOnContinueBtn() {
        signinContinueBtn.click();
    }

    public void typeOnPasswordField(String userPassword) {
        passwordField.sendKeys(userPassword);
        ExtentTestManager.log("Password inserted");
    }

    public void clickOnSigninBtn() {
        signinBtn.click();
    }


}
