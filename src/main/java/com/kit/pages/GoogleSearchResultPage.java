package com.kit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
public class GoogleSearchResultPage {

    private WebDriver webDriver;
    By linkLocator = By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a");
    private WebElement link;


    public GoogleSearchResultPage(WebDriver webDriver) {
        this.webDriver=webDriver;
    }
    public String getLinkTekst(){
        link = webDriver.findElement(linkLocator);
        return link.getText();
    }
}
