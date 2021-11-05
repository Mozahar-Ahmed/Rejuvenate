package com.ebayTest;

import base.TestBase;
import com.ebay.data.DataProviders;
import com.ebay.pages.HomePage;
import com.ebay.pages.LoginPage;
import extent.ExtentTestManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData", enabled = false)
    public static void UserBeingAbleToTypeOnSearchBar(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchBar();
        ExtentTestManager.log("Search bar clicked on");
        homePage.typeOnSearchBar(data);
        ExtentTestManager.log("Data typed on search field");
    }

    @Test(enabled = false)
    public void validateSearchButtonClickable() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateAdvanceSearch() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnAdvanceSearch();
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void userBeingAbleToLLogin(String userid, String userPassword) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnSigninBtn();
        //loginPage.clickOnSwitchAccountButton();
        loginPage.typeOnUseridField(userid);
        loginPage.clickOnContinueBtn();
        loginPage.typeOnPasswordField(userPassword);
        loginPage.clickOnSigninBtn();
    }

}
