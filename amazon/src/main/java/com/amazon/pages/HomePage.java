package com.amazon.pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import report.ExtentTestManager;

public class HomePage {
    @FindBy(id = "nav-link-accountList")
    private WebElement accountandlink;
    @FindBy(linkText = "Start here.")
    private WebElement startHerelink;

    public void mouseHoverOnAccountAndLink() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(accountandlink);
        ExtentTestManager.log("Mouse is being hovered on accounts and link button");
        startHerelink.click();
        ExtentTestManager.log("Clicked on start here link");
    }
}
