package com.aimprosoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By elementBy) {
        driver.findElement(elementBy).click();
    }

    public void writeText(By elementBy, String text) {
        driver.findElement(elementBy).sendKeys(text);
    }

}
