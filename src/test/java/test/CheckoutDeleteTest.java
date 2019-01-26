package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homecheckoutdelete;
import utilities.TestBase;

public class CheckoutDeleteTest extends TestBase {
    Homecheckoutdelete homecheckoutdelete;

    @Test
    public void checkOut() throws InterruptedException {
        homecheckoutdelete=new Homecheckoutdelete ();
        homecheckoutdelete.open ();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript ("window.scrollBy(0,500)","");
        Thread.sleep (2000);
        Actions actions = new Actions (driver);
        actions.moveToElement(homecheckoutdelete.blouse).build ().perform ();
        homecheckoutdelete.addCart.click ();
        Thread.sleep (2000);
        homecheckoutdelete.continueShop.click ();
        actions.moveToElement(homecheckoutdelete.imgDress).build ().perform ();
        Thread.sleep (1000);
        homecheckoutdelete.addDress.click ();
        Thread.sleep (1000);
        homecheckoutdelete.proceedButton.click ();
        String tproducts = homecheckoutdelete.twoProducts.getText ();
       Assert.assertTrue (tproducts.contains ("2"));
       Thread.sleep (2000);
       homecheckoutdelete.trash.click ();
       Thread.sleep (2000);
       String oproduct = homecheckoutdelete.twoProducts.getText ();
       Assert.assertTrue (oproduct.contains ("1"));

       homecheckoutdelete.trash2.click ();

       String empty = homecheckoutdelete.empty2.getText ();
       Assert.assertTrue (empty.contains ("empty"));


    }

}
