package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Homecheckoutdelete {
    public Homecheckoutdelete() {
        PageFactory.initElements (Driver.getDriver (), this);
    }

    @FindBy(xpath = "(//a[@class=\"product-name\"])[2]")
    public WebElement blouse;

    @FindBy(xpath = "(//a[@class='button ajax_add_to_cart_button btn btn-default']/span)[2]")
    public WebElement addCart;

    @FindBy(xpath = "//span[@class='continue btn btn-default button exclusive-medium']/span")
    public WebElement continueShop;

    @FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[3]")
    public WebElement imgDress;

    @FindBy(xpath = "(//a[@class='button ajax_add_to_cart_button btn btn-default'])[3]")
    public WebElement addDress;

    @FindBy(xpath = "//a[@class='btn btn-default button button-medium']/span")
    public WebElement proceedButton;

   @FindBy(xpath = "//a[@title='View my shopping cart']/span[1]")
    public WebElement twoProducts;
   @FindBy(xpath ="//i[@class='icon-trash']" )
   public WebElement trash;

   @FindBy(id="3_13_0_0")
   public WebElement trash2;

   @FindBy(xpath = "//span[@class='ajax_cart_no_product']")
   public WebElement empty2;






    public void open() {

        Driver.getDriver ().get (ConfigurationReader.getProperty ("url"));
    }
}
