package com.kit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Kateryna Zora  on 12.06.2017.
 */
public class OpenGmailComPage {
    private WebDriver webDriver;
    private WebElement searchField;
    By searchLocator = By.className("gmail-nav__nav-link__sign-in");

    public OpenGmailComPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(String url) {
        webDriver.get(url);
    }
    public void enterLoginPage() {
        searchField = webDriver.findElement(searchLocator);
        searchField.click();
    }
}