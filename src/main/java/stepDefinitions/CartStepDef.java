package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartStepDef {
    CartPage cartPage = new CartPage();

    @Then("the bag is in the cart")
    public void isBagPresent(){
        cartPage.isBagPresent();
    }

    @And("user clicks on checkout")
    public void userClicksOnCheckout() {
        cartPage.clickOnCheckout();
    }
}
