package com.kit.pages.google;

import com.kit.util.WebDriverUtil;
import org.openqa.selenium.WebDriver;

/**
 * Created by Kateryna Zora  on 16.06.2017.
 */
public class GoogleBasePage {
    protected WebDriver webDriver;
    protected WebDriverUtil webDriverUtil;

    public GoogleBasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverUtil = new WebDriverUtil(webDriver);
    }
    public void takeScreenShot(String attachName){
        webDriverUtil.saveScreenshot(attachName);
    }
    public void open (String url) {
        webDriver.get(url);
    }
}
