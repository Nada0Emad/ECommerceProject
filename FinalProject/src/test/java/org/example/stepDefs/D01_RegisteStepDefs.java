package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_RegisteStepDefs {
    P01_register register =new P01_register();
    SoftAssert soft = new SoftAssert();
    @Given("user go to register page")
    public void goRegisterPage(){
        register.registerlink().click();
    }

    @When("user could select gender type")
    public void genderSelect() throws InterruptedException {
    register.genderSelect().click();
    }


    @And("^user enter firstname \"(.*)\"and last name \"(.*)\"$")
    public void firstNameValid(String fName, String lName){
        register.firstNameValid(fName).sendKeys();
        register.lastNameValid(lName).sendKeys();
    }

    @And("user enter date of birth")
    public void birthdate(){
    }

    @And("^user enter email \"(.*)\"$")
    public void emailValid(){
        register.emailValid().sendKeys();
    }

    @And("^user fills password fields \"(.*)\" \"(.*)\"$")
    public void passwordValid(){
        register.passwordValid().sendKeys();
        register.passwordConfirmed().sendKeys();
    }

    @And("user clicks on register button")
    public void registerBtnPressed(){register.registerBtn().click();}

    @Then("success message will be displayed")
    public void successMsg(){
    String actualText = register.messageCorrect().getText();
    String expectedText = "Your registration completed";
        soft.assertEquals(actualText.contains(expectedText), true);
    String actualColor = register.messageCorrect().getCssValue("color");
    String expectedColor = "rgba(76,177,124)";
        soft.assertEquals(actualColor.contains(expectedColor),true);
        soft.assertAll();

    }
}
