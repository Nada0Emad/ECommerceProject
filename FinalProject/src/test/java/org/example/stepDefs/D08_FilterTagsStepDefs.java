package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_FilterTags;
import org.testng.asserts.SoftAssert;

public class D08_FilterTagsStepDefs {
    P08_FilterTags filterTags = new P08_FilterTags();
    SoftAssert soft = new SoftAssert();

    @And("user clicked on any product image")
    public void productPage(){
        filterTags.productImage().click();
    }
    @When("user pressed specific tag")
    public void selectTag(){
        filterTags.specificTag().click();
    }
    @And("user mapped to this url \"(.*)\"")
    public void tagNavigatedPage(){
        String actualPage = filterTags.tagPageNav();
        String expectedPage ="https://demo.nopcommerce.com/computer";
        soft.assertEquals(actualPage.contains(expectedPage),true);
        soft.assertAll();
    }
    @Then("user shows \"Products tagged with\" specific tag")
    public void productAppeared(){
       String actual= filterTags.msgDisplayed().getText();
       String expected = "Products tagged with 'computer'";
       soft.assertEquals(actual.contains(expected),true);
       soft.assertAll();

    }
}
