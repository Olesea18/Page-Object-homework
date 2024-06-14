package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AuthPage;

public class AuthStepDef {
    AuthPage authPage = new AuthPage();

    @When("user enters {string} username")
    public void enterUserName(String username){
        authPage.enterUserName(username);
    }

    @And("user enters {string} password")
    public void userEntersPassword(String password) {
        authPage.enterPassword(password);
    }

    @And("user clicks on Login Button")
    public void userClicksOnLoginButton() {
        authPage.clickOnLoginButton();
    }
}
