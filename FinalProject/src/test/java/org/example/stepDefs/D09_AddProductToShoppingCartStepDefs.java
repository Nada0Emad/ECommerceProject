package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P09_AddProductToShoppingcard;
import org.testng.asserts.SoftAssert;

public class D09_AddProductToShoppingCartStepDefs {
    P09_AddProductToShoppingcard productShoppingCart = new P09_AddProductToShoppingcard();
    SoftAssert soft = new SoftAssert();

    @When("user choose \"Apple MacBook Pro 13-inch\"and press add to cart icon below it")
    public void addToCart() {
        productShoppingCart.shoppingCartClicked().click();
    }

    @And("user navigated to product page clicked")
    public void navigateToSelectedProduct() {
        String actualLink = productShoppingCart.navigatedToItemShopped();
        String expectedLink = "https://demo.nopcommerce.com/apple-macbook-pro-13-inch";
        soft.assertEquals(actualLink.contains(expectedLink), true);
        soft.assertAll();
    }
    @And("user pressed Add to cart icon")
    public void addToCart2() {
        productShoppingCart.addToCart2().click();
    }
    @Then("user show message success message")
    public void msgDisplayed(){
        String actualMsg = productShoppingCart.msgDisplayed().getText();
        String expectedMsg = "The product has been added to your shopping cart";
        soft.assertEquals(actualMsg.contains(expectedMsg),true);
        soft.assertAll();
    }

    @And("user shows shopping cart item increased by 1")
    public void incShoppingCart(){
        String actualShopNo = productShoppingCart.shoppingCartIconInc().getText();
        String expectedShopNo ="2";
        soft.assertEquals(actualShopNo.contains(expectedShopNo),true);
        soft.assertAll();
    }

}