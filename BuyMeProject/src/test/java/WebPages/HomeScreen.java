package WebPages;

import BasePages.BasePage;
import org.openqa.selenium.By;

public class HomeScreen extends BasePage {


    public void choosePrice() {
        clickElement(By.className("chosen-single"));
        getWebElements(By.className("active-result"), 5).click();

    }

    public void chooseArea() {
        clickElement(By.linkText("אזור"));
        getWebElements(By.className("active-result"), 5).click();

    }

    public void chooseCategory() {
        clickElement(By.linkText("קטגוריה"));
        getWebElements(By.className("active-result"), 5).click();

    }

    public void search() {
        clickElement(By.id("ember1068"));

    }
}




