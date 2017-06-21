package com.kit.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.commons.lang3.EnumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
public class WebDriverTestBase {

    protected WebDriver webDriver;
    private String browser = System.getProperty("browser");

    @BeforeClass
    public void setUp(){
//       ChromeDriverManager.getInstance().setup(); // Automatically download and sets up the latest driver
//       webDriver = new ChromeDriver();
        setBrowser();
        webDriver.manage().window().maximize();
//        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void setBrowser(){
        Browser runBrowser = EnumUtils.isValidEnum(Browser.class, browser) ? //проверка(валидные) value of, null, default browser
          Browser.valueOf(browser.toUpperCase()) : Browser.CHROME ;
        switch (runBrowser){
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                webDriver = new ChromeDriver();
                break;
            case FF:
                FirefoxDriverManager.getInstance().setup();
                webDriver = new FirefoxDriver();
                break;
        }
    }
    @AfterClass
    public void tearDown(){
//        Close a browser
        webDriver.close();
//        Close a browser's tab
//        webDriver.quit();
    }
}
