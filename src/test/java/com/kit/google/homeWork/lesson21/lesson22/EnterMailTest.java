package com.kit.google.homeWork.lesson21.lesson22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by Kateryna Zora  on 08.06.2017.
 */
public class EnterMailTest {
    private WebDriver webDriver;
    private String gmailOpen;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\IdeaProjects\\src\\main\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        gmailOpen = "https://www.google.com/intl/ru/gmail/about/";
        webDriver.get(gmailOpen);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void enterMail() throws InterruptedException {
        By searchLocator = By.className("gmail-nav__nav-link__sign-in");
        webDriver.findElement(searchLocator).click();

        String enterMail = "mouse911cat@gmail.com";
        String enterPass = "mousecat";

        By enterLoginLocator = By.id("identifierId");
        WebElement element = webDriver.findElement(enterLoginLocator);
        element.sendKeys(enterMail);
       // webDriver.findElement(enterLoginLocator).sendKeys(enterMail);
        System.out.println(enterMail);
        By clickLocator = By.id("identifierNext");
        webDriver.findElement(clickLocator).click();

        By enterPassLocator = By.name("password");
        webDriver.findElement(enterPassLocator).sendKeys(enterPass);

        By loaderLocator = By.className("A NuIbb IdAqtf");
        WebDriverWait wait = new WebDriverWait(webDriver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loaderLocator));

        By click2StepLocator = By.id("passwordNext");
        webDriver.findElement(click2StepLocator).click();

        By loaderLocator2 = By.className("ANuIbb IdAqtf");
        WebDriverWait wait2 = new WebDriverWait(webDriver, 30);
        wait2.until(ExpectedConditions.invisibilityOfElementLocated(loaderLocator2));

        By verifyLocator = By.cssSelector(".gb_b.gb_db.gb_R");
        WebElement verify = webDriver.findElement(verifyLocator);
        assertTrue(verify.getAttribute("title").contains(enterMail));

    }

//    @AfterClass
//    public void afterclose(){webDriver.close();}

}
