package com.epam.utils.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyParser {
    private Properties properties;
    private InputStream input;

    public PropertyParser() {
        properties = new Properties();
        input = null;
        try {
            input = new FileInputStream("src/main/resources/config.properties");
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
