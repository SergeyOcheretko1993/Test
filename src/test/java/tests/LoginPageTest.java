package tests;

import com.aimprosoft.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        loginPage = new LoginPage(getDriver());
    }

    @Parameters({"correctEmailAddress", "correctPassword"})
    @Test
    public void loginTestWithCorrectData(String correctEmailAddress, String correctPassword) {
        loginPage.goToLoginPage();
        loginPage.logInWithData(correctEmailAddress, correctPassword);
        Assert.assertTrue(loginPage.isWelcomeTextVisible(), "Welcome icon is not visible");

    }

    @Parameters({"inCorrectEmailAddress", "correctPassword"})
    @Test
    public void loginTestWithInCorrectEmailAddress(String inCorrectEmailAddress, String correctPassword) {
        loginPage.goToLoginPage();
        loginPage.logInWithData(inCorrectEmailAddress, correctPassword);
        Assert.assertTrue(loginPage.isErrorMessageVisible(), "Error message is not visible");
    }

    @Parameters({"correctEmailAddress", "inCorrectPassword"})
    @Test
    public void logInTestWithInCorrectPassword(String correctEmailAddress, String inCorrectPassword) {
        loginPage.goToLoginPage();
        loginPage.logInWithData(correctEmailAddress, inCorrectPassword);
        Assert.assertTrue(loginPage.isErrorMessageVisible(), "Error message is not visible");
    }

    @Parameters({"inCorrectEmailAddress", "inCorrectPassword"})
    @Test
    public void logInTestWithInCorrectEmailAddressAndPassword(String inCorrectEmailAddress, String inCorrectPassword) {
        loginPage.goToLoginPage();
        loginPage.logInWithData(inCorrectEmailAddress, inCorrectPassword);
        Assert.assertTrue(loginPage.isErrorMessageVisible(), "Error message is not visible");

    }

    @Parameters("correctPassword")
    @Test
    public void logInTestWithEmptyEmailAddressField(String correctPassword) {
        loginPage.goToLoginPage();
        loginPage.logInWithData("", correctPassword);
        Assert.assertTrue(loginPage.isErrorMessageVisible(), "Error message is not visible");

    }

    @Parameters("correctEmailAddress")
    @Test
    public void logInTestWithEmptyPasswordField(String correctEmailAddress) {
        loginPage.goToLoginPage();
        loginPage.logInWithData(correctEmailAddress, "");
        Assert.assertTrue(loginPage.isErrorMessageVisible(), "Error message is not visible");
    }

    @Test
    public void logInTestWithEmptyEmailAddressAndPasswordField() {
        loginPage.goToLoginPage();
        loginPage.logInWithData("", "");
        Assert.assertTrue(loginPage.isErrorMessageVisible(), "Error message is not visible");
    }

}