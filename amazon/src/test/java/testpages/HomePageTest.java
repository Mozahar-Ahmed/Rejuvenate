package testpages;

import base.TestBase;
import com.amazon.pages.CreateAccountPage;
import com.amazon.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    @Test(enabled = false)
    public void userBeingAbleToRegister() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        homePage.mouseHoverOnAccountAndLink();
        createAccountPage.validateCreateAccountTextIsDisplayed();
    }

    @Test(enabled = false)
    public void validateCreateAccountPageUrl() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        homePage.mouseHoverOnAccountAndLink();
        createAccountPage.validateUrl();
    }

    @Test
    public void validateCreateAccountFormContentIsBeingDisplayed() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        homePage.mouseHoverOnAccountAndLink();
        createAccountPage.validateCreateAccountFormContentIsDisplayed();
    }
}
