package driver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static void initDriver() {
        String browser = ConfigReader.getProperty("browser");
        WebDriver driver = null;
        if(browser.equalsIgnoreCase("ch")) {
            driver = new ChromeDriver();
        }
        else if (browser.equals("ff")) {
            driver=new FirefoxDriver();
        } else if (browser.equals("ee")) {
            driver=new EdgeDriver();
        }
        else{
            System.out.println("No Browser has been set up");
        }
        assert driver != null;
        driver.manage().window().maximize();
        DriverManager.setDriver(driver);
    }
}