package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement bagItem = $(By.id("item_4_title_link"));
    private final SelenideElement checkoutButton = $(By.xpath("//button[@class=\"btn btn_action btn_medium checkout_button \"]"));

    public void isBagPresent() {
        bagItem.should(Condition.appear);
    }

    public void clickOnCheckout() {
        checkoutButton.should(Condition.visible);
        checkoutButton.should(Condition.clickable);
        checkoutButton.click();
    }
}
