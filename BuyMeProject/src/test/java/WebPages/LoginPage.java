package WebPages;

import BasePages.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void register() {
        enterRegisterPage();
        enterCredentials();
    }

    public void loginBuyMe() {
        submitLogin();
    }


    private void enterRegisterPage() {
        clickElement(By.className("seperator-link"));
        clickElement(By.className("text-link"));
    }

    private void enterCredentials() {
        sendKeysToElement(By.className("ember-text-field"), "Noa");
        sendKeysToElement(By.cssSelector("input[placeholder = מייל]"), "noaa476@gmail.com");
        sendKeysToElement(By.cssSelector("input[placeholder = סיסמה]"), "noa1234");
        sendKeysToElement(By.cssSelector("input[placeholder=\"אימות סיסמה\"]"), "noa1234");
    }

    public void confirmRegister() {
        clickElement(By.className("label"));
    }

    private void submitLogin() {
        clickElement(By.className("seperator-link"));
        sendKeysToElement(By.cssSelector("input[type= email]"), "noaa476@gmail.com");
        sendKeysToElement(By.cssSelector("input[placeholder=סיסמה]"), "noa1234");
        clickElement(By.cssSelector("button[type = submit]"));
    }

}