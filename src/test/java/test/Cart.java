package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.HomePages;
import utilities.Driver;
import utilities.TestBase;

public class Cart extends TestBase {
    HomePages homePages;

    @Test
    public void addcart() throws InterruptedException {
        homePages = new HomePages ();
        homePages.open ();
        Actions actions = new Actions (Driver.getDriver ());
        // actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        actions.moveToElement (homePages.pic).build ().perform ();
        homePages.blouse.click ();
        Thread.sleep (1000);
        homePages.addBlouse.click ();
        Thread.sleep (1000);
        homePages.continueButton.click ();
        Thread.sleep (1000);
        driver.navigate ().back ();
        homePages.dress.click ();
        Thread.sleep (1000);
        homePages.addDress.click ();
        Thread.sleep (1000);
        driver.navigate ().back ();
        Thread.sleep (1000);

        homePages.cart.click ();
        actions.moveToElement (homePages.incart).build ().perform ();

        String product = homePages.twoProduct.getText ();
        String number = "2";
        Assert.assertTrue (product.contains (number));
        String in = homePages.incart.getText ();
        Assert.assertEquals (number, in);

        actions = new Actions (driver);


    }
}           // actions.moveToElement (homePages.cartProduct).build ().perform ();
      //  actions.moveToElement (homePages.cart).build ().perform ();
//       actions.moveToElement (homePages.cart).build ().perform ();




// homePages=new HomePages();
//
//         homePages.open();
//
     //  Actions actions=new Actions(driver);
//
//        // actions.sendKeys( Keys.PAGE_DOWN).build().perform();
//
//
//        actions.moveToElement( homePages.image ).build().perform();
//
//        Thread.sleep( 1000 );
//
//        homePages.addCart.click();
