package com.kit.core.google.homeWork.slotTest;

import com.kit.core.WebDriverTestBase;
import com.kit.slot.OpenSlotCom;
import org.testng.annotations.Test;

public class SlotTest extends WebDriverTestBase {
    private String slotCom = "http://slotmachinescript.com/";
    private final String spinButton = "SPIN";

    @Test
    public void SlotTest(){
        OpenSlotCom openSlotCom = new OpenSlotCom(webDriver);
        openSlotCom.open(slotCom);
        openSlotCom.fillAndClickButton();
        openSlotCom.changeTheBet();
        openSlotCom.fillAndClickButton();
        openSlotCom.checkTotal();
    }
}
