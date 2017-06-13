package com.kit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Kateryna Zora  on 12.06.2017.
 */
public class VerifyLoginPage {
    private WebDriver webDriver;
    By verifyLocator = By.cssSelector(".gb_b.gb_db.gb_R");
    private WebElement link;

    public VerifyLoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public String getVerifyLocator(){
        link = webDriver.findElement(verifyLocator);
        return link.getAttribute("title");
    }
}
