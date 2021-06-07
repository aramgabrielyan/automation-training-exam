import Helpers.WaitHelper;
import PageObjects.LoginPage;
import PageObjects.UserPage;
import org.testng.annotations.Test;

import static Setup.DriverSetup.driver;
import static org.testng.Assert.assertTrue;

public class LoginFunctionalityTest extends TestBase {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.init();
        loginPage.typeUsername("exam-user-1");
        loginPage.typePassword("exampassword");
        loginPage.clickLoginButton();
        UserPage userPage = new UserPage();
        assertTrue(userPage.isAvatarDisplayed(), "User is logged in");
    }
}
