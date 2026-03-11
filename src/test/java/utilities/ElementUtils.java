package utilities;

import driver.DriverManager;
import org.openqa.selenium.*;

public class ElementUtils {
    WebDriver driver;

    public ElementUtils() {
        driver = DriverManager.getDriver();
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
    public void click(By locator) {
        getElement(locator).click();
    }
    public void type(By locator, String text) {
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(text);
    }
    public String getText(By locator) {
        return getElement(locator).getText();
    }
    public boolean isDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }
}
