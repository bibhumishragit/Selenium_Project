package pages;

import org.openqa.selenium.By;
import utilities.Waitutils;

public class LoginPage extends BasePage{
    Waitutils waitelement=new Waitutils();

    By username = By.xpath("(//input[@type='text'])[2]");
    By password = By.id("password");
    By loginBtn = By.id("login");
    By popup=By.className("b3wTlE");
    By login=By.xpath("(//span[@class='v1zwn27'])[1]");

    public void enterUsername(String user) {
        waitelement.waitForElementVisible(username);
        elementUtil.type(username,user);
    }

    public void enterPassword(String pass) {
        elementUtil.type(password,pass);
    }

    public void clickLogin() {
        elementUtil.click(loginBtn);
    }

    public void signinpopup(){
        waitelement.waitForElementVisible(popup);
        elementUtil.isDisplayed(popup);
        elementUtil.click(popup);
    }

    public void login(){
        waitelement.waitForElementVisible(login);
        elementUtil.click(login);
    }

    public void login(String user,String pass) {
        waitelement.waitForElementVisible(username);
        enterUsername(user);
        //enterPassword(pass);
        //clickLogin();
    }
}
