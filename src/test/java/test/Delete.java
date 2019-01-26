package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageDelete;
import utilities.Driver;
import utilities.TestBase;

public class Delete extends TestBase {

    HomePageDelete homePageDelete = new HomePageDelete ();
@Test
    public void delete() throws InterruptedException {
        homePageDelete=new HomePageDelete ();
        homePageDelete.open ();
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript ("window.scrollBy(0,500)","");
    Thread.sleep (2000);
    Actions actions = new Actions (driver);
    actions.moveToElement(homePageDelete.image).build ().perform ();
    homePageDelete.addCart.click ();
    //driver.getWindowHandle ();
    Thread.sleep (2000);
    homePageDelete.continueButton.click ();
    jse.executeScript ("window.scrollBy(0,-300)","");
    actions.moveToElement (homePageDelete.cartHover).build ().perform ();
    Thread.sleep (2000);
    homePageDelete.cross.click ();
    String emp = homePageDelete.empty.getText ();
    Assert.assertTrue (emp.isEmpty ());

    }
}
