package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Kateryna Zora  on 12.06.2017.
 */
public class VerifyLoginPage extends GoogleBasePage{
//    private WebDriver webDriver;
    By verifyLocator = By.cssSelector(".gb_b.gb_db.gb_R");
    private WebElement link;

    public VerifyLoginPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }
    public String getVerifyLocator(){
        link = webDriverUtil.waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(verifyLocator));
//        link = webDriver.findElement(verifyLocator);
        return link.getAttribute("title");
    }
}
