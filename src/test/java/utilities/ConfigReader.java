package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;
    private static String propertiesfilepath="D:\\Eclipse-Workspace\\Selenium_Project\\src\\test\\resources\\config\\Config.properties";

    public static void loadConfig(){
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(propertiesfilepath);
            prop.load(fis);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return prop.getProperty(key);
    }
}
