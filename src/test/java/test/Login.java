package test;

import org.testng.annotations.Test;
import pages.HomePages;
import utilities.ConfigurationReader;
import utilities.TestBase;

public class Login extends TestBase {
    HomePages homePages;

    @Test
    public void login() {
        homePages = new HomePages ();
        homePages.open ();
//        homePages.signinbutton.click ();
//        String email = ConfigurationReader.getProperty ("email");
//        String password = ConfigurationReader.getProperty ("password");
        homePages.login ();
    }
}