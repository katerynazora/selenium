package com.kit.core.google.homeWork.lesson22;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.EnterMailPage;
import com.kit.pages.EnterPassPage;
import com.kit.pages.OpenGmailComPage;
import com.kit.pages.VerifyLoginPage;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
public class EnterMailTest extends WebDriverTestBase{

    private String gmailOpen = "https://www.google.com/intl/ru/gmail/about/";
    private String enterMail = "mouse911cat@gmail.com";
    private String enterPass = "mousecat";

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
