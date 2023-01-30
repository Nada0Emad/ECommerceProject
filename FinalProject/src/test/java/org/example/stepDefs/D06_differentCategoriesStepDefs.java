package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_differentCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D06_differentCategoriesStepDefs {
    P06_differentCategories differentCategories = new P06_differentCategories();
    @When("user hover on any category")
    public void hoverCategory(){

    }

    @And("user open any subcategory")
    public void openSubCategory(){

    }

    @Then("user show subcategory's selected page")
    public void selectedCategoryPage(){

    }
}
