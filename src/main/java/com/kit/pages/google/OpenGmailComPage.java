package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Kateryna Zora  on 12.06.2017.
 */
public class OpenGmailComPage extends GoogleBasePage{
//    private WebDriver webDriver;
    private WebElement searchField;
    By searchLocator = By.className("gmail-nav__nav-link__sign-in");

    public OpenGmailComPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }
//    public void open(String url) {
//        webDriver.get(url);
//    }
    public void enterLoginPage() {
        webDriverUtil.waitForExpectedCondition(ExpectedConditions.presenceOfElementLocated(searchLocator));
        searchField = webDriver.findElement(searchLocator);
        searchField.click();
    }
}