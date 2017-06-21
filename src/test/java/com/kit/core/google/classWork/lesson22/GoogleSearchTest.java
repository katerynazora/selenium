package com.kit.core.google.classWork.lesson22;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.google.GoogleSearchPage;
import com.kit.pages.google.GoogleSearchResultPage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
@Features("GoogleSearch")
@Stories("WEB-777")
public class GoogleSearchTest extends WebDriverTestBase {

    private String googleSearch= "https://www.google.com.ua/";
    private final String searchText = "Selenium"; // for all test

    @Title("Google search test - positive scenario")
    @Description("Searches any text on google.com")
    @Test
    public void searchTest(){
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(webDriver);
        googleSearchPage.open(googleSearch);
        googleSearchPage.fillAndSubmitSearchData(searchText);
        GoogleSearchResultPage googleSearchResultPage = new GoogleSearchResultPage(webDriver);
        googleSearchResultPage.takeScreenShot(searchText);
        assertTrue(googleSearchResultPage.getLinkTekst().contains(searchText));
    }
}

//    @Test
//    public void searchTest(){
//        GoogleSearchPage googleSearchPage = PageFactory.initElements(webDriver, GoogleSearchPage.class);
//        googleSearchPage.open(googleSearch);
//        googleSearchPage.fillAndSubmitSearchData(searchText);
//        GoogleSearchResultPage googleSearchResultPage = PageFactory.initElements(webDriver, GoogleSearchResultPage.class);
//        assertTrue(googleSearchResultPage.getLinkTekst().contains(searchText));
//    }