package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P11_AddProductToCompareList;
import org.testng.asserts.SoftAssert;

public class D11_AddProductToCompareListStepDefs {
    P11_AddProductToCompareList product2CompareList = new P11_AddProductToCompareList();
    SoftAssert soft = new SoftAssert();


    @When("user choose \"Apple MacBook Pro 13-inch\"and press add to compare list icon below it")
    public void setProduct2CompareList(){
        product2CompareList.compareIconClicked().click();
    }
    @Then("user show success compare message")
    public void compareMsgDisplayed(){
    String actualMsg = product2CompareList.compareMsg().getText();
    String expectedMsg = "The product has been added to your product comparison";
    soft.assertEquals(actualMsg.contains(expectedMsg),true);
    soft.assertAll();
    }
}
