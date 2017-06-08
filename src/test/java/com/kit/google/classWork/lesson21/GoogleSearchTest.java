package com.kit.google.classWork.lesson21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertTrue;


/**
 * Created by Kateryna Zora  on 02.06.2017.
 */
public class GoogleSearchTest {

    private String googleSearch;
    private WebDriver webDriver;

    @BeforeClass
    public void setUp(){
       System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\src\\main\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        googleSearch = "https://www.google.com.ua/";
        webDriver.get(googleSearch); // открывает страницу
        webDriver.manage().window().maximize(); // открывает на всю страницу
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // неявное ожидание
    }

    @Test
    public void searchTest(){
        String searchText = "Selenium";
//        By searchLocator = By.cssSelector("#lst-ib"); // куда отправлять данные
//        By searchLocator = (By.name("q")); // куда отправлять данные
        By searchLocator = By.id("lst-ib");
        WebElement searchField = webDriver.findElement(searchLocator); // переходит по атрибуту (в веб елемент)
        searchField.sendKeys(searchText);
        searchField.submit(); // отправка данных (Enter)
//        By linkLocator = By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a"); // по xpath в FirePath
//        WebElement link = webDriver.findElement(linkLocator);
//        assertTrue(link.getText().contains(searchText)); // верефецируем, что это точно первая ссылка
//
    }

}
