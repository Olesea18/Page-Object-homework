package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutPage;

public class CheckoutStepDefs {

    CheckoutPage checkoutPage = new CheckoutPage();

    @And("fills in the form")
    public void fillForm() {checkoutPage.fillForm();
    }

    @And("clicks continue")
    public void clicksContinue() { checkoutPage.clickContinue();
    }

    @And("checks delivery is free")
    public void checksDeliveryIsFree() { checkoutPage.checkDeliveryIsFree();
    }

    @And("clicks finish")
    public void clicksFinish() { checkoutPage.clickFinish();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() { checkoutPage.checkSuccessMessageIsDisplayed();
    }
}
