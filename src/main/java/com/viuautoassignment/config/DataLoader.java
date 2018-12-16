package com.viuautoassignment.config;

import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Kedar
 */
public class DataLoader {

    public static Properties config;
    public static Properties locator;

    /*Data Provider class which loads data from Properties files once before a Selected Suite Run
    * Can also be an extension of Data Provider class with MSExcel or .csv*/

    @BeforeSuite
    public void loadData() throws IOException {

        config = new Properties();
        config.load(DataLoader.class.getClassLoader().getResourceAsStream("config.properties"));
        locator = new Properties();
        locator.load(DataLoader.class.getClassLoader().getResourceAsStream("locator.properties"));

    }

}
