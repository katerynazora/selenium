package com.kit.core.google.homeWork.lesson22;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.EnterMailPage;
import org.junit.Test;

/**
 * Created by Kateryna Zora  on 09.06.2017.
 */
public class EnterMailTest extends WebDriverTestBase{

    private String gmailOpen = "https://www.google.com/intl/ru/gmail/about/";
    private String enterMail = "mouse911cat@gmail.com";
    private String enterPass = "mousecat";

    @Test
    public void loginTest(){
        EnterMailPage enterMailPage = new EnterMailPage(webDriver);
        enterMailPage.open(gmailOpen);
        enterMailPage.enterLoginPage();
        enterMailPage.fillAndSendKey(enterMail);




    }
}
