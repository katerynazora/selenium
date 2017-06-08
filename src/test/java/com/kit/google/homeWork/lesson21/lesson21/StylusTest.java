package com.kit.google.homeWork.lesson21.lesson21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by Kateryna Zora  on 06.06.2017.
 *
 */
public class StylusTest {

    private String googleSearch;
    private WebDriver webDriver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\src\\main\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        googleSearch = "http://www.stylus.com.ua/";
        webDriver.get(googleSearch); // открывает страницу
        webDriver.manage().window().maximize(); // открывает на всю страницу
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // неявное ожидание
    }

    @Test
    public void stylusTest(){
        String searchText2 = "Sony Xperia Z2";
        By searchLocator = (By.cssSelector("#head-search>form>input")); // куда отправлять данные
        WebElement searchField = webDriver.findElement(searchLocator); // переходит по атрибуту (в веб елемент)
        searchField.sendKeys(searchText2);
        searchField.submit(); // отправка данных (Enter)
        By linkLocator = By.xpath(".//*[@id='search-list']/ul/li[1]/a/span"); // по xpath в FirePath
        WebElement link = webDriver.findElement(linkLocator);
        assertTrue(link.getText().contains(searchText2)); // верефецируем, что это точно первая ссылка
        link.click();
        By headerLocator = By.xpath(".//*[@id='product-block']/header/div[1]/h1");
        WebElement header = webDriver.findElement(headerLocator);
        assertTrue(header.getText().contains(searchText2));
    }

}
