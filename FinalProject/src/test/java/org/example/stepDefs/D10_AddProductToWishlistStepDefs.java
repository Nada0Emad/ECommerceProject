package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.P10_AddProductToWishlist;

public class D10_AddProductToWishlistStepDefs {
    P10_AddProductToWishlist productWishlist = new P10_AddProductToWishlist();

    @When("user go to HTC One M8 Android L 5.0 Lollipop product")
    public void selectProductToAdd(){
        productWishlist.addProductToWishlist().isDisplayed();
    }
    @And("user clicks on heart icon below the product")
    public void clickHeartIcon(){
        productWishlist.clickHeartIcon().click();
    }
}
