package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
public class GoogleSearchResultPage extends GoogleBasePage{

//    private WebDriver webDriver;
    By linkLocator = By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a");
//    @FindBy (xpath = ".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a")
    private WebElement link;

    public GoogleSearchResultPage(WebDriver webDriver){
        super(webDriver);
//        this.webDriver=webDriver;
    }
    @Step ("Check search result")
    public String getLinkTekst(){
        link = webDriverUtil.waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(linkLocator));
        return link.getText();
    }
    public void clickLink(){
        webDriverUtil.jsClick("gb_70","id");
    }
}
