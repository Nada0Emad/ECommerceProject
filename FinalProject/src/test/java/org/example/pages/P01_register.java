package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerlink(){
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement genderSelect(){return Hooks.driver.findElement(By.cssSelector("span[class=\"female\"]"));}
    public WebElement firstNameValid(String string){return Hooks.driver.findElement(By.id("input[id=\"FirstName\"]"));}
    public WebElement lastNameValid(String lName){return Hooks.driver.findElement(By.id("input[id=\"LastName\"]"));}
    public WebElement birthdate(){return Hooks.driver.findElement(By.cssSelector("div[class=\"date-picker-wrapper\"]"));}
    public WebElement emailValid(){return Hooks.driver.findElement(By.id("input[id=\"Email\"]"));}

    public WebElement passwordValid(){return Hooks.driver.findElement(By.id("input[id=\"Password\"]"));}

    public WebElement passwordConfirmed(){return Hooks.driver.findElement(By.id("input[id=\"ConfirmPassword\"]"));}

    public WebElement registerBtn(){return Hooks.driver.findElement(By.cssSelector("button[id=\"register-button\"]"));}
    public WebElement messageCorrect(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}
