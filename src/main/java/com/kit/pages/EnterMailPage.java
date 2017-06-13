package com.kit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
public class EnterMailPage {
    private WebDriver webDriver;
    private WebElement searchField;

    By enterLoginLocator = By.id("identifierId");
    By clickLocator = By.id("identifierNext");

    public EnterMailPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public void fillAndSendKey(String enterMail){
        searchField = webDriver.findElement(enterLoginLocator);
        searchField.sendKeys(enterMail);
        searchField.submit();
    }
    public void clickNext (){
        searchField = webDriver.findElement(clickLocator);
        searchField.click();
    }
}
