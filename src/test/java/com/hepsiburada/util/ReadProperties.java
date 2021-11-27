package com.hepsiburada.util;

import com.hepsiburada.base.BaseTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    static Properties userProperties;
    static {
        userProperties = new Properties();
        try {
            InputStream propertiesStream = BaseTest.class.getClassLoader().getResourceAsStream("user.properties");
            userProperties.load(propertiesStream);
            propertiesStream.close();
            propertiesStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCustomerNo(){
        return userProperties.getProperty("_CUSTOMERNO");
    }

    public static String getPassword() {
        String password = userProperties.getProperty("_PASSWORD");
        System.out.println("Password at properties file: " + password);
        return password;
    }
}
