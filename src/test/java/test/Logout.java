package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageOut;
import pages.HomePages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;

public class Logout extends TestBase {
    HomePageOut homePageOut;
    HomePages homePages;

    @Test
    public void logout() throws InterruptedException {
        homePageOut = new HomePageOut ();
        homePageOut.open ();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollBy(0,900)","");
          Thread.sleep (2000);

        Actions actions = new Actions (Driver.getDriver ());
        actions.moveToElement(homePageOut.img).perform();
        homePageOut.addcart.click ();
        Thread.sleep (2000);
        jse.executeScript ("window.scrollBy(0,-900)","");
        Thread.sleep (2000);
        actions.moveToElement (homePageOut.homecart).click ().build ().perform ();
        String dressver=homePageOut.dress.getText ();
        Thread.sleep (3000);
        //Assert.assertEquals (homePageOut.addcart.getText (),dressver);
        homePages = new HomePages ();
        homePages.signinbutton.click ();

        String email = ConfigurationReader.getProperty ("email");
        String password = ConfigurationReader.getProperty ("password");
        homePages.login();
        Thread.sleep (1000);
    //    homePages.logout.click ();

//        String emptyc = homePages.emptyCart.getText ();
//        Assert.assertTrue(emptyc.contains ("empty"));

       // actions.sendKeys (Keys.PAGE_DOWN).perform ();
       // actions.sendKeys (Keys.ARROW_DOWN).perform ();
//        actions.moveToElement (homePageOut.homecart).build ().perform ();
//        actions.moveToElement(homePageOut.homecart).click ();
//        Thread.sleep (2000);
//        actions.moveToElement(homePageOut.homecart).build ().perform ();



//        Actions builder = new Actions(driver);
//        builder.moveToElement(hoverElement).perform();
//        By locator = By.id("clickElementID");
//        driver.click(locator);



        // homePageOut.addcart.click ();
       // actions.moveToElement (homePageOut.img).build ().perform ();

       // Thread.sleep (1000);
       // homePageOut.homecart.click ();


       // homePageOut.logDress.click ();


    }
}