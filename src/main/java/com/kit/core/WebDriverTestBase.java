package com.kit.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
public class WebDriverTestBase {

    protected WebDriver webDriver;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\src\\main\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void tearDoun(){
//        Close a browser
        webDriver.close();
//        Close a browser's tab
//        webDriver.quit();
    }

}
