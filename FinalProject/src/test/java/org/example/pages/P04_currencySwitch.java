package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_currencySwitch {
    public WebElement currencyList(){
        return Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
    }
    public WebElement currencyIconSelected(){
        return Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }
    public WebElement currencyProductDisplayed(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }

}
