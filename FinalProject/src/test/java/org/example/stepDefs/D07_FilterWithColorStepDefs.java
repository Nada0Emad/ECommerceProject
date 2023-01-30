package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_FilterWithColor;


public class D07_FilterWithColorStepDefs {
    P07_FilterWithColor filterColor = new P07_FilterWithColor();

    @When("user press on Apparel Menu Icon")
    public void IconSelected(){

    }
    @And("user choose Shoes submenu")
    public void subMenuSelected(){

    }

    @And("user select red color from checkbox")
    public void colorSelected(){

    }
    @Then("user shows the product which match with the color")
    public void showProduct(){

    }
}
