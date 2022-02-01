package WebPages;

import BasePages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HowToSendPage extends BasePage {


    public void sendByMail() {
        clickElementFromlist(By.className("circle-area"), 1);
        sendKeysToElement(By.cssSelector("input[data-parsley-type=\"email\"]"), Keys.CONTROL + "a");
        sendKeysToElement(By.cssSelector("input[data-parsley-type=\"email\"]"), "noaa476@gmail.com");
    }

    public void enterSenderName() {
        clearText(By.cssSelector("input[placeholder=\"שם שולח המתנה\"]"));
        sendKeysToElement(By.cssSelector("input[placeholder=\"שם שולח המתנה\"]"), "Noa");
    }

    public void paymentSubmit() {
        clickElement(By.cssSelector("button[type=\"submit\"]"));
    }

}