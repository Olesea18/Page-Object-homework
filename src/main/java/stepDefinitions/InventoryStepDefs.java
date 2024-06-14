package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.InventoryPages;

public class InventoryStepDefs {

    InventoryPages inventoryPages = new InventoryPages();


    @When("user adds the bag to the cart")
    public void addBag(){
        inventoryPages.addBag();
    }

    @And("navigates to cart")
    public void navigateToCart() {
        inventoryPages.navigateToCart();
    }
}


