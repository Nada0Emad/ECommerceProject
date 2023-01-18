package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.example.pages.P04_searchForProduct;
import org.testng.asserts.SoftAssert;

public class D04_SearchForProductStepDefs {
    P04_searchForProduct searchProduct = new P04_searchForProduct();
    SoftAssert soft = new SoftAssert();
    @When("user search about \"(.*)\" in searchbox")
    public void searchText(String product){
        searchProduct.searchbox().sendKeys(product);
    }

    @And("user click on search button")
    public void searchBtn(){
        searchProduct.searchBtn().click();
        String actual= Hooks.driver.getCurrentUrl() ;
        String expected="https://demo.nopcommerce.com/search?q=computer";
        soft.assertEquals(actual.contains(expected),true);
    }
    @Then("user show the product on the page")
    public void productOut(){
        searchProduct.shownProduct().isDisplayed();
    }


}
