package com.viuautoassignment.screens;

import com.viuautoassignment.core.BaseAndroidDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Kedar
 */
public class Landing {

    public AndroidDriver driver;
    WebDriverWait wait;

    /*Pagefactory class considering different screens of the applications as a Page
    * Self Initiated in this case but can be dynamically initiated through the calling class*/

    @FindBy(id="com.vuclip.viu:id/internal_layout_1")
    WebElement hindilanguage;

    public Landing(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver,30);
    }

    public void selectHindiLanguage(){
        wait.until(ExpectedConditions.visibilityOf(hindilanguage)).click();
    }
}
