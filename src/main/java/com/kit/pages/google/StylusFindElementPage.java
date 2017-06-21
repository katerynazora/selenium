package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Kateryna Zora  on 21.06.2017.
 */
public class StylusFindElementPage extends GoogleBasePage{
    private WebElement link;
    By linkLocator = By.xpath(".//*[@id='search-list']/ul/li[1]/a/span");

    public StylusFindElementPage(WebDriver webDriver)
    {
        super(webDriver);
    }
    public void setSearchField(String searchTextSony){
        link = webDriverUtil.waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(linkLocator));
        link.getText().contains(searchTextSony);
        link.click();
    }
}
