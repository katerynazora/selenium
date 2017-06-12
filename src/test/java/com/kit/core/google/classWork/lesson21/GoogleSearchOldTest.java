package com.kit.core.google.classWork.lesson21;

import com.kit.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by Kateryna Zora  on 02.06.2017.
 */
public class GoogleSearchOldTest extends WebDriverTestBase{

    private String googleSearch= "https://www.google.com.ua/";

    @Test
    public void searchTest(){
        webDriver.get(googleSearch);
        String searchText = "Selenium";
//        By searchLocator = By.cssSelector("#lst-ib"); // куда отправлять данные
//        By searchLocator = (By.name("q")); // куда отправлять данные
        By searchLocator = By.id("lst-ib");
        WebElement searchField = webDriver.findElement(searchLocator); // переходит по атрибуту (в веб елемент)
        searchField.sendKeys(searchText);
        searchField.submit(); // отправка данных (Enter)
        By linkLocator = By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a"); // по xpath в FirePath
        WebElement link = webDriver.findElement(linkLocator);
        assertTrue(link.getText().contains(searchText)); // верефецируем, что это точно первая ссылка
//
    }

}
