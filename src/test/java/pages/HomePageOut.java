package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePageOut {
    public HomePageOut() {
        PageFactory.initElements (Driver.getDriver (), this);
    }
    @FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[5]")
    public WebElement img;

    @FindBy(xpath = "(//a[@title=\"Add to cart\"]/span)[5]")
    public WebElement addcart;

    @FindBy(xpath = "//div[@class='shopping_cart']/a")
    public WebElement homecart;

    @FindBy(xpath = "//a[@class='cart_block_product_name']")
    public WebElement dress;


    public void open() {

        Driver.getDriver ().get (ConfigurationReader.getProperty ("url"));
    }
}