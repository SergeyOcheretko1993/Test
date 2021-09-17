package tests;

import com.aimprosoft.Util;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(String driverName) {
        driver = Util.setEnvironmentAndGetDriver(driverName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void close() {
        driver.quit();
    }

    protected WebDriver getDriver() {
        return driver;
    }
}

