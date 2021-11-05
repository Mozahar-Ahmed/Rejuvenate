package testpages;

import base.TestBase;
import com.amazon.pages.CreateAccountPage;
import com.amazon.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends TestBase {
    @Test
    public void userBeingAbleToCreateAnAccount() {
        CreateAccountPage createAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.mouseHoverOnAccountAndLink();
        createAccountPage.validateCreateAnAccountForm();
    }

}
