package com.viuautoassignment.core;

import com.viuautoassignment.config.DataLoader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @author Kedar
 */

public class BaseAndroidDriver extends DataLoader {

    protected AndroidDriver driver;

    /*Setup to be done before execution of Test Class Considering the target was flow through the application*/

    @BeforeClass

    public void startAUT() throws Exception {

        File appDir = new File(System.getProperty("user.dir")+ File.separator+"src"+File.separator+
                "main"+File.separator+"resources"+File.separator+"apks"+File.separator+"Viu_com.vuclip.viu.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName",config.getProperty("platformName"));
        capabilities.setCapability("platformVersion",config.getProperty("N7platformVersion"));
        capabilities.setCapability("deviceName",config.getProperty("N7deviceName"));
        capabilities.setCapability("app",appDir.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    }

    /*Exit Driver Close application*/

    @AfterClass
    public void closeAUT(){

        driver.quit();

    }
}
