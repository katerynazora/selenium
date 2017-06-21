package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Kateryna Zora  on 21.06.2017.
 */
public class StylusSearchResultPage extends GoogleBasePage{
    private WebElement searchField;
    private WebElement link;
    By headerLocator = By.xpath(".//*[@id='product-block']/header/div[1]/h1");

    public StylusSearchResultPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }
    public void getVerifyLocator(String searchTextSony){
        link = webDriverUtil.waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(headerLocator));
        link.getText().contains(searchTextSony);
    }
}
