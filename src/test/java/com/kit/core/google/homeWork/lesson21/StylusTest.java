package com.kit.core.google.homeWork.lesson21;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.google.StylusFindElementPage;
import com.kit.pages.google.StylusOpenPage;
import com.kit.pages.google.StylusSearchResultPage;
import org.testng.annotations.Test;

/**
 * Created by Kateryna Zora  on 06.06.2017.
 *
 */

public class StylusTest extends WebDriverTestBase {

    private String googleSearch = "http://www.stylus.com.ua/";
    private final String searchTextSony = "Sony Xperia Z2";

    @Test
    public void stylusTest(){
        StylusOpenPage stylusOpenPage = new StylusOpenPage(webDriver);
        stylusOpenPage.open(googleSearch);
        stylusOpenPage.fillAndSubmitSearchField(searchTextSony);
        StylusFindElementPage stylusFindElementPage = new StylusFindElementPage(webDriver);
        stylusFindElementPage.setSearchField(searchTextSony);
        StylusSearchResultPage stylusSearshResultPage = new StylusSearchResultPage(webDriver);
        stylusSearshResultPage.getVerifyLocator(searchTextSony);

    }
}
//    @Test
//    public void stylusTest(){
//        By searchLocator = (By.cssSelector("#head-search>form>input")); // куда отправлять данные
//        WebElement searchField = webDriver.findElement(searchLocator); // переходит по атрибуту (в веб елемент)
//        searchField.sendKeys(searchTextSony);
//        searchField.submit(); // отправка данных (Enter)

//        By linkLocator = By.xpath(".//*[@id='search-list']/ul/li[1]/a/span"); // по xpath в FirePath
//        WebElement link = webDriver.findElement(linkLocator);
//        assertTrue(link.getText().contains(searchTextSony)); // верефецируем, что это точно первая ссылка
//        link.click();
//        By headerLocator = By.xpath(".//*[@id='product-block']/header/div[1]/h1");
//        WebElement header = webDriver.findElement(headerLocator);
//        assertTrue(header.getText().contains(searchTextSony));
//    }