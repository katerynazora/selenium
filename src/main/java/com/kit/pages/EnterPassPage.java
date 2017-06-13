package com.kit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Kateryna Zora  on 12.06.2017.
 */
public class EnterPassPage {
    private WebDriver webDriver;
    private WebElement searchField;

    By enterPassLocator = By.name("password");
    By click2StepLocator = By.id("passwordNext");

    public EnterPassPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void fillAndSendPassKey(String enterPass){
        searchField = webDriver.findElement(enterPassLocator);
        searchField.sendKeys(enterPass);
        searchField.submit();
    }
    public void clickNext2 (){
        searchField = webDriver.findElement(click2StepLocator);
        searchField.click();
    }

}
