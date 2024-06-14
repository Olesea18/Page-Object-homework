package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InventoryPages {
    private final SelenideElement addBagToCart = $(By.id("add-to-cart-sauce-labs-backpack"));
    private final SelenideElement cartItem = $(By.className("shopping_cart_link"));

    public void addBag() {
        addBagToCart.should(Condition.clickable).click();
    }

    public void navigateToCart() {
        cartItem.should(Condition.appear).click();
    }
}
