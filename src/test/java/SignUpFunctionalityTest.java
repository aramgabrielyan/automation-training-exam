import PageObjects.LoginPage;
import PageObjects.SignUpPage;
import PageObjects.UserPage;
import org.testng.annotations.Test;

import static Setup.DriverSetup.driver;
import static org.testng.Assert.assertTrue;

public class SignUpFunctionalityTest extends TestBase{


    @Test
    public void signUpTest(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.init();
        signUpPage.typeUsername("exam-user");
        signUpPage.typePassword("exampassword");
        signUpPage.typeFullName("Exam User");
        signUpPage.typeEmail("testexammail@mail.com");
        signUpPage.checkBoxClick();
        signUpPage.clickSignUpButton();
        UserPage userPage = new UserPage();
        assertTrue(userPage.isWelcomeDisplayed(), "User was not signed up");
    }
}
