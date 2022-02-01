package WebPages;

import BasePages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SenderReceiverInformationScreen extends BasePage {

    public void enterReceiverName() {
        clearText(By.id("ember2025"));
        sendKeysToElement(By.id("ember2025"), "שירה");


    }

    public void enterPurpose() {
        clickElement(By.className("selected-name"));
        clickElement(By.id("ember2060"));

    }

    public void enterTextForBlessing() {
        sendKeysToElement(By.cssSelector("textarea[data-parsley-group=voucher-greeting]"), Keys.CONTROL + "a");
        sendKeysToElementWithKeys(By.cssSelector("textarea[data-parsley-group=voucher-greeting]"), Keys.DELETE, "Happy Birthday and Congratulations");
    }

    public void uploadPhoto() {
        sendKeysToElement(By.cssSelector("input[type=file]"), "\"C:\\Users\\ADMIN\\Downloads\\IMG_2844.JPG\"");
    }


    public void pressContinue() {
        clickElement(By.cssSelector("button[gtm=המשך]"));
    }


}