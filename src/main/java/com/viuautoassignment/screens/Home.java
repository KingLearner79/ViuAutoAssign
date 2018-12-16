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
public class Home {

    public AndroidDriver driver;
    WebDriverWait wait;

    /*Pagefactory class considering different screens of the applications as a Page
     * Self Initiated in this case but can be dynamically initiated through the calling class*/

    @FindBy(id="com.vuclip.viu:id/iv_search")
    WebElement search;

    @FindBy(id="com.vuclip.viu:id/search_box")
    WebElement searchbox;

    public Home(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver,30);
    }

    public void checkSearch(){
        wait.until(ExpectedConditions.visibilityOf(search)).isDisplayed();
    }

    public void openSearchBox(){
        wait.until(ExpectedConditions.visibilityOf(search)).click();
    }

    public void searchTitle(String title){
        wait.until(ExpectedConditions.visibilityOf(searchbox)).sendKeys(title);
    }


}
