package stepdefinition;

import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ElementUtils;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("user opens application")
    public void openApplication() {
        DriverManager.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("user logs in")
    public void login(){
        loginPage.signinpopup();
        loginPage.login();
        loginPage.login("bibhu.prasadmishra@yahoo.in","1234");
    }
}
