package stepDefinitions;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class BaseStepDef {

    @When("open application")
    public void openApp(){

    }


    @And("Sleep {int}")
    public void sleep(int miliseconds) {
        Selenide.sleep(miliseconds);
    }
}
