package com.aimprosoft;

import org.openqa.selenium.By;

public final class LocatorsForLoginPage {
    public static final By EMAIL_ADDRESS_FIELD = By.name("j_username");
    public static final By ERROR_MESSAGE = By.xpath("//div[@class='alert alert-danger alert-dismissable getAccAlert']");
    public static final By WELCOME = By.xpath("//li[@class='logged_in js-logged_in']");
    public static final By PASSWORD_FIELD = By.name("j_password");
    public static final By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Log In']");
    public static final String BASE_URL = "https://electronic-1905.aimprosoft.com/electronics/en/login";
}
