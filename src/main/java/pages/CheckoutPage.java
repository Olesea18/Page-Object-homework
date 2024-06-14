package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    private final SelenideElement firstNameField = $(By.xpath("//*[@id=\"first-name\"]"));
    private final SelenideElement lastNameField = $(By.xpath("//*[@id=\"last-name\"]"));
    private final SelenideElement zipCodeField = $(By.xpath("//*[@id=\"postal-code\"]"));
    private final SelenideElement continueButton = $(By.xpath("//*[@id=\"continue\"]"));
    private final SelenideElement shippingInformation = $(By.xpath("//*[@id=\"checkout_summary_container\"]//div[4]"));
    private final SelenideElement finishButton = $(By.xpath("//*[@id=\"finish\"]"));
    private final SelenideElement successMessage = $(By.xpath("//h2[@class=\"complete-header\"]"));

    public void fillForm() {
        firstNameField.should(Condition.appear).sendKeys("Olesea");
        lastNameField.should(Condition.appear).sendKeys("Gamurari");
        zipCodeField.should(Condition.appear).sendKeys("2002");
    }

    public void clickContinue() {
        continueButton.should(Condition.visible);
        continueButton.should(Condition.clickable);
        continueButton.click();
    }

    public void checkDeliveryIsFree() {
        shippingInformation.should(Condition.visible);
        shippingInformation.shouldHave(text("Free Pony Express Delivery!"));
    }

    public void clickFinish() {
        finishButton.should(Condition.visible);
        finishButton.should(Condition.clickable);
        finishButton.click();
    }

    public void checkSuccessMessageIsDisplayed() {
        successMessage.should(Condition.visible);
        successMessage.shouldHave(text("Thank you for your order!"));
    }
}
