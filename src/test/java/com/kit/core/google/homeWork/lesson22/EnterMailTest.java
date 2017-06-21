package com.kit.core.google.homeWork.lesson22;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.google.EnterMailPage;
import com.kit.pages.google.EnterPassPage;
import com.kit.pages.google.OpenGmailComPage;
import com.kit.pages.google.VerifyLoginPage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;

import static org.junit.Assert.assertTrue;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
@Features("Login To Gmail")
public class EnterMailTest extends WebDriverTestBase{

    private String gmailOpen = "https://www.google.com/intl/ru/gmail/about/";
    private String enterMail = "mouse911cat@gmail.com";
    private String enterPass = "mousecat";


    @Description("Login in on google.com")
    @Test
    public void loginTest(){
        OpenGmailComPage openGmailComPage = new OpenGmailComPage(webDriver);
        openGmailComPage.open(gmailOpen);
        openGmailComPage.enterLoginPage();

        EnterMailPage enterMailPage = new EnterMailPage(webDriver);
        enterMailPage.fillAndSendKey(enterMail);
        enterMailPage.clickNext();

        EnterPassPage enterPassPage = new EnterPassPage(webDriver);
        enterPassPage.fillAndSendPassKey(enterPass);
        enterPassPage.clickNext2();

        VerifyLoginPage verifyLoginPage = new VerifyLoginPage(webDriver);
        assertTrue(verifyLoginPage.getVerifyLocator().contains(enterMail));
    }
}
