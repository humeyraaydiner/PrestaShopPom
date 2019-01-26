package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePages {
    public HomePages(){
        PageFactory.initElements (Driver.getDriver (),this);
    }

     @FindBy(xpath = "//a[@class='login']")
      public WebElement signinbutton;

      @FindBy(id="email")
      public WebElement emailField;

    @FindBy(id="passwd")
    public WebElement passwordField;

   @FindBy(xpath = "//i[@class='icon-lock left']")
    public WebElement signIn;

   @FindBy(className = "logout")
   public WebElement logout;

   @FindBy(xpath = "(//a[@title='View my shopping cart']/span)[5]")
   public WebElement emptyCart;

    public void login() {
        signinbutton.click ();
        String email = ConfigurationReader.getProperty ("email");
        String password = ConfigurationReader.getProperty ("password");
        emailField.sendKeys (email);
        passwordField.sendKeys (password);
        signIn.click ();
    }
    @FindBy(xpath="(//a[@class='quick-view'])[2]")
    public WebElement pic;

    @FindBy(xpath = "(//a[@class=\"product-name\"])[2]")
    public WebElement blouse;

    @FindBy(xpath="//button[@name='Submit']/span")
    public  WebElement addBlouse;

   @FindBy(xpath="//i[@class='icon-chevron-left left']")
        public WebElement continueButton;
   @FindBy(xpath = "(//a[@class='product-name'])[3]")
   public  WebElement dress;

   @FindBy(xpath = "//button[@name=\"Submit\"]/span")
   public WebElement addDress;

   @FindBy(xpath = "//a[@title='View my shopping cart']")
   public WebElement cart;


   @FindBy(xpath = "//span[@id='summary_products_quantity']")
   public WebElement twoProduct;

   @FindBy(xpath = "//a[@title='View my shopping cart']/span")
   public WebElement cartProduct;

   @FindBy(xpath = "//a[@title='View my shopping cart']/span")
    public WebElement incart;





   public void open(){

        Driver.getDriver ().get (ConfigurationReader.getProperty ("url"));
    }



}

