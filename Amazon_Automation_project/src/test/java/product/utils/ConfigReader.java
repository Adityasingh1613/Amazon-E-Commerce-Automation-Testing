package product.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties configProps;
    private static Properties credentialsProps;

    static{
        try{

            configProps = new Properties();
            try (InputStream configStream = ConfigReader.class.getClassLoader()
                    .getResourceAsStream("config.properties")) {
                if (configStream == null) {
                    throw new RuntimeException("config.properties not found in resources folder!");
                }
                configProps.load(configStream);
            }

            String credentialsFile = configProps.getProperty("credentialsFile");
            credentialsProps = new Properties();
            try (InputStream credStream = ConfigReader.class.getClassLoader()
                    .getResourceAsStream(credentialsFile)) {
                if (credStream == null) {
                    throw new RuntimeException(credentialsFile + " not found in resources folder!");
                }
                credentialsProps.load(credStream);
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load property files!");
        }
    }

    public static String getConfig(String key) {
        return configProps.getProperty(key);
    }

    public static String getCredential(String key) {
        return credentialsProps.getProperty(key);
    }
}
