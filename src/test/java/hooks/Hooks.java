package hooks;

import driver.DriverFactory;
import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {
    @Before
    public void setup() {
        ConfigReader.loadConfig();
        DriverFactory.initDriver();
    }

    @After
    public void teardown() {
        DriverManager.getDriver().quit();
        DriverManager.unload();
    }
}
