package utilities;

import driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waitutils {
    WebDriverWait wait;

    public Waitutils(){
        wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(30));
    }
    public void waitForElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
