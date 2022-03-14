package utils;

import java.util.Properties;

public class PropertyFileReader {
    private Properties prop = null;

    public PropertyFileReader() {
        prop = new Properties();
        try {
            prop.load(ResourceHelper.getResourcePathInputStream("/config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPropertyValueByKeyName(String propertyKey) {
        return prop.getProperty(propertyKey);
    }

}
