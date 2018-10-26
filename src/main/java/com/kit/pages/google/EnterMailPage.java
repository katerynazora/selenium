package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
public class EnterMailPage extends GoogleBasePage{
//    private WebDriver webDriver;
    private WebElement searchField;

    By enterLoginLocator = By.id("identifierId");
    By clickLocator = By.id("identifierNext");


    public EnterMailPage(WebDriver webDriver){
        super(webDriver);
        this.webDriver = webDriver;
    }
    public void fillAndSendKey(String enterMail){
        webDriverUtil.waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(enterLoginLocator));
        searchField = webDriver.findElement(enterLoginLocator);
        searchField.sendKeys(enterMail);
        searchField.submit();
    }
    public void clickNext (){
        searchField = webDriver.findElement(clickLocator);
        searchField.click();
    }

}
