package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_currencySwitch;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.example.stepDefs.D02_LoginStepDefs;

public class D05_CurrencySwitch {
    P05_currencySwitch currency = new P05_currencySwitch();
    D02_LoginStepDefs test= new D02_LoginStepDefs();
    SoftAssert soft = new SoftAssert();

    @Given("user logged to the system")
    public void loggedUser(){
        test.successLogin();
    }
    @When("user go to home page and clicks on currency list")
    public void goToHomepage(){
        currency.currencyList().getText();
        currency.currencyList().click();
    }

    @And("user chose the euro")
    public void chooseEuro(){
        currency.currencyIconSelected().click();
    }
    @Then("user will show the change of currency on any product")
    public void currencyProductDisplayed(){
       String actualCurrency =  currency.currencyProductDisplayed().getText();
       String expectedCurrency = "€1548.00";
        soft.assertEquals(actualCurrency.contains(expectedCurrency),true);
    }

}
