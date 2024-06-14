package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {
    private final SelenideElement usernameField = $(By.id("user-name"));
    private final SelenideElement passwordField = $(By.id("password"));
    private final SelenideElement loginButton = $(By.id("login-button"));

    public void enterUserName (String username){
        usernameField.should(Condition.appear).sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.should(Condition.appear).sendKeys(password);

    }

    public void clickOnLoginButton() {
        loginButton.should(Condition.appear).click();
    }
}
