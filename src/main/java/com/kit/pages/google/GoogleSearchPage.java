package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
public class GoogleSearchPage extends GoogleBasePage{
//    private WebDriver webDriver;

    By searchLocator = By.id("lst-ib");
//    @FindBy(id = "lst-ib")
    private WebElement searchField;

    public GoogleSearchPage(WebDriver webDriver) {
        super(webDriver);
//        this.webDriver = webDriver;
    }
//    public void open (String url){
//        webDriver.get(url);
//    }
    @Attachment (value = "{0}", type = "text/plain")
    @Step ("Fills a search text {0} and press enter")
    public void fillAndSubmitSearchData(String searchText){
//        webDriverUtil.waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(searchLocator));
        searchField = webDriver.findElement(searchLocator);
        searchField.sendKeys(searchText);
        searchField.submit();
    }
}
