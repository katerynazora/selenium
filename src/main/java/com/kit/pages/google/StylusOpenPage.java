package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Kateryna Zora  on 21.06.2017.
 */
public class StylusOpenPage extends GoogleBasePage{
    private WebElement searchField;
    By searchLocator = (By.cssSelector("#head-search>form>input"));

    public StylusOpenPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void fillAndSubmitSearchField(String searchTextSony){
        searchField = webDriver.findElement(searchLocator);
        searchField.sendKeys(searchTextSony);
        searchField.submit();
    }
}