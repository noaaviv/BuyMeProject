package WebPages;

import BasePages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PickBusiness extends BasePage {

    String buymePickBusinessUrl = "https://buyme.co.il/search?budget=4&category=16&region=13";

    public void assertWebsiteUrl(String element) {
        Assert.assertEquals(element, buymePickBusinessUrl);
    }


    public void pickBusinessAndMount() {
        clickElement(By.linkText("מסעדת טאיזו"));
        sendKeysToElement(By.cssSelector("input[placeholder=\"הכנס סכום\"]"), "300");
        clickElement(By.cssSelector("button[gtm=\"בחירה\"]"));
    }


}