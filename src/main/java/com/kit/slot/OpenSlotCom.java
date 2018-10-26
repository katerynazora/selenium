package com.kit.slot;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.google.GoogleBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenSlotCom extends GoogleBasePage {
    private WebElement searchField;
    private WebElement link;
    By searchLocator = By.id("spinButton");
    By betUpLocator = By.id("betSpinUp");
    By creditsLocator = By.id("credits");

    public OpenSlotCom(WebDriver webDriver) {
        super(webDriver);
    }
    public void fillAndClickButton() {
        searchField = webDriver.findElement(searchLocator);
        searchField.click();
        webDriverUtil.waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(searchLocator));
    }
    public void changeTheBet(){
        searchField = webDriver.findElement(betUpLocator);
        searchField.click();
        searchField.click();
    }
    public void checkTotal (){
        link = webDriver.findElement(creditsLocator);
        System.out.println(link.getText());
    }
}
