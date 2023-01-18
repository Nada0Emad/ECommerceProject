package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDefs {
    P02_login login = new P02_login();
    SoftAssert soft = new SoftAssert();

    @Given("user go to login page")
    public void loginLink(){
        login.loginLink().click();
    }

    @When("^user login with valid \"(.*)\" and \"(.*)\"$")
    public void ValidData(String email, String password){
        login.validEmail().clear();
        login.validEmail().sendKeys();
        login.validPassword().sendKeys();
    }

    @And("user press on login button")
    public void loginBtnPressed(){
        login.loginBtn().click();
    }

    @Then("user login to the system successfully")
    public void successLogin(){
       String actualLink = login.currentUrl();
       String expectedLink = "https://demo.nopcommerce.com/";
       soft.assertEquals(actualLink.contains(expectedLink), true);
       login.validLogin().isDisplayed();
       soft.assertAll();
    }

    @When("^user login with invalid \"(.*)\" and \"(.*)\"$")
    public void invalidEmail(String email, String password){
        login.inValidEmail().sendKeys();
        login.validPassword().sendKeys();
    }

    @Then("user couldn't login to the system successfully")
    public void invalidLogin(){
        String actualMsg = login.errorLogin().getText();
        String expectedMsg = "Login was unsuccessful. Please correct the errors and try again.";
        soft.assertEquals(actualMsg.contains(expectedMsg),true);
        String actualColor = login.errorLogin().getCssValue("color");
        String expectedColor = "rgba(228,67,75)";
        soft.assertEquals(actualColor.contains(expectedColor),true);
        soft.assertAll();

    }


}
