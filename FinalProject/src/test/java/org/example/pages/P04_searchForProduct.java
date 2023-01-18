package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_searchForProduct {
    public WebElement searchbox(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
    }

    public WebElement searchBtn(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
    }

    public WebElement shownProduct(){
        return Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"]"));
    }
}
