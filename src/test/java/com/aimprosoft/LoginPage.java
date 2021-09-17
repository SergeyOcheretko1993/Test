package com.aimprosoft;

import org.openqa.selenium.WebDriver;

import static com.aimprosoft.LocatorsForLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        driver.get(BASE_URL);
    }

    public void logInWithData(String emailAddress, String password) {
        writeText(EMAIL_ADDRESS_FIELD, emailAddress);
        writeText(PASSWORD_FIELD, password);
        click(LOGIN_BUTTON);
    }

    public boolean isWelcomeTextVisible() {
        return driver.findElement(WELCOME).isDisplayed();
    }

    public boolean isErrorMessageVisible() {
        return driver.findElement(ERROR_MESSAGE).isDisplayed();
    }
}


