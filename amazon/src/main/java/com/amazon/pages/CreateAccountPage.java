package com.amazon.pages;

import base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import report.ExtentTestManager;

public class CreateAccountPage {
    Logger LOGGER = Logger.getLogger(CreateAccountPage.class);
    @FindBy(xpath = "//h1[@class='a-spacing-small']")
    private WebElement createAccount;
    @FindBy(xpath = "(//label[@class='a-form-label'])[1]")
    private WebElement yourName;
    @FindBy(xpath = "(//label[@class='a-form-label'])[2]")
    private WebElement email;
    @FindBy(xpath = "(//label[@class='a-form-label'])[3]")
    private WebElement password;
    @FindBy(xpath = "(//label[@class='a-form-label'])[4]")
    private WebElement reenterpassword;
    @FindBy(id = "ap_customer_name")
    private WebElement nameField;
    @FindBy(id = "ap_email")
    private WebElement emailField;
    @FindBy(id = "ap_password")
    private WebElement passwordField;
    @FindBy(id = "ap_password_check")
    private WebElement reenterPasswordlField;
    @FindBy(id = "continue")
    private WebElement createYourAmazonAccountBtn;

    //Hard assert
    public void validateCreateAccountTextIsDisplayed() {
        //boolean flag= createAccount.isDisplayed();
        //Assert.assertTrue(flag);
        //Assert.assertEquals(createAccount.isDisplayed(),true);
        Assert.assertTrue(createAccount.isDisplayed());
        ExtentTestManager.log("Create account text has been displayed");

    }

    public void validateUrl() {
        String actualUrl = TestBase.driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("https://www.amazon.com/ap/register"));
        ExtentTestManager.log("Create account page url has been verified");
    }

    //Soft assert
    public void validateCreateAccountFormContentIsDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(yourName.isDisplayed());
        ExtentTestManager.log("Your name text has been displayed");
        softAssert.assertEquals(email.isDisplayed(), true);
        String actualData = email.getText();
        String expectedData = "email";
        softAssert.assertEquals(actualData, expectedData);
        ExtentTestManager.log("Email text is displayed on email field");
        softAssert.assertTrue(password.isDisplayed(), "password text is displayed");
        ExtentTestManager.log("Password text has been displayed on top of the password field");
        softAssert.assertTrue(reenterpassword.isDisplayed());
        ExtentTestManager.log("Reenter passeord text has been displayed on top of that field");
        softAssert.assertAll();
    }

    public void validateCreateAnAccountForm() {
        nameField.sendKeys("Mozahar Ahmed");
        LOGGER.info("User name is being typed");
        emailField.sendKeys("mozahar33@gmail.com");
        ExtentTestManager.log("User email id has been inserted");
        passwordField.sendKeys("S@deque1971");
        ExtentTestManager.log("Email id has been printed");
        reenterPasswordlField.sendKeys("S@deque1971");
        ExtentTestManager.log("Password reentered to check");
        createYourAmazonAccountBtn.click();
        LOGGER.info("Continue button clicked");
    }


}
