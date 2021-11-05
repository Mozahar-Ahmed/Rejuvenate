package com.ebay.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(xpath = "(//a[contains( text(), 'Sign in')])[1]")
    private WebElement signinBtn;
    @FindBy(id = "gh-ac")
    private WebElement searchBar;
    @FindBy(id = "gh-btn")
    private WebElement searchButton;
    @FindBy(id = "gh-as-a")
    private WebElement advanceSearch;
    @FindBy(id = "gh-Alerts-i")
    private WebElement bellIcon;

    public void clickOnSigninBtn() {
        signinBtn.click();
    }

    public void clickOnSearchBar() {
        searchBar.click();
    }

    public void typeOnSearchBar(String data) {
        searchBar.sendKeys(data);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void clickOnAdvanceSearch() {
        advanceSearch.click();
    }

}
