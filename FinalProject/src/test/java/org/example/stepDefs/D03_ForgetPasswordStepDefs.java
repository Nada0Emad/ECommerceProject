package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_forgetPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D03_ForgetPasswordStepDefs {
    P03_forgetPassword forgetPassword = new P03_forgetPassword();

    @Given("user could go to login page")
    public void navigateLogin(){
        forgetPassword.loginLink().click();
    }
    @When("^user login with valid \"(.*)\"$")
    public void ValidEmailOnly(String email){
        forgetPassword.validEmail().clear();
        forgetPassword.validEmail().sendKeys();
    }

    @And("user press on forget password?")
    public void forgetPassword(){
        forgetPassword.forgetPassword().click();
        String actual = driver.getCurrentUrl();
        String expected = "https://demo.nopcommerce.com/passwordrecovery";
        Assert.assertTrue(actual.contains(expected));}

    @And("^user enter email \"(.*)\" again$")
    public void reEnterEmail(String email){
        forgetPassword.reEnterEmail().sendKeys(email);
        forgetPassword.reEnterEmail().sendKeys(Keys.ENTER);
    }
    @Then("user show message that email is sent to his/her email")
    public void messageForRestPassword(){
        forgetPassword.messageDisplayed().isDisplayed();
        String actualColor = forgetPassword.messageDisplayed().getCssValue("color");
        String expectedColor = "rgba(255,255,255,1)";
        Assert.assertTrue(actualColor.contains(expectedColor));
    }
}
