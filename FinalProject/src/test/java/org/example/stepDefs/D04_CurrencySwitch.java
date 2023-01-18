package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_currencySwitch;
import org.testng.Assert;

public class D04_CurrencySwitch {
    P04_currencySwitch currency = new P04_currencySwitch();
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
        Assert.assertEquals(actualCurrency.contains(expectedCurrency),true);
    }

}
