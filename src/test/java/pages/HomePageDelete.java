package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePageDelete {
    public HomePageDelete() {
        PageFactory.initElements (Driver.getDriver (), this);
    }

    @FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[4]")
     public WebElement image;

    @FindBy(xpath = "(//a[@class='button ajax_add_to_cart_button btn btn-default']/span)[4]")
    public WebElement addCart;

    @FindBy(xpath = "//i[@class='icon-chevron-left left']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class='shopping_cart']/a")
    public WebElement cartHover;

    @FindBy(xpath = "//a[@class='ajax_cart_block_remove_link']")
    public WebElement cross;

    @FindBy(xpath = "(//a[@title='View my shopping cart']/span)[5]")
    public WebElement empty;

    public void open() {

        Driver.getDriver ().get (ConfigurationReader.getProperty ("url"));
    }
}