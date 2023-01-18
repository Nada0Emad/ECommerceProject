package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P03_forgetPassword {

    public WebElement loginLink(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement validEmail(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement forgetPassword(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));}
    public WebElement reEnterEmail(){return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Enter your email\"]"));}
    public WebElement messageDisplayed(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

}
