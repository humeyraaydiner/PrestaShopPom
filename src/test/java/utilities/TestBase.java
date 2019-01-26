package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected SoftAssert softAssert;

    @BeforeMethod
    public void setUpMethod() {
        driver = Driver.getDriver ();


        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        driver.manage ().window ().maximize ();
        actions = new Actions (driver);
        softAssert = new SoftAssert ();
    }

    @AfterMethod
    public void tearDownMethod() {
        BrowserUtils.wait (3);
//        Driver.closeDriver ();
//        softAssert.assertAll ();
//    }assertAll
    }
}
