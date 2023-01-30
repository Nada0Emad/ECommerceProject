package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_AddProductToShoppingcard {
    public WebElement shoppingCartClicked(){
        return Hooks.driver.findElement(By.cssSelector("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]"));
    }
    public String navigatedToItemShopped(){
        return Hooks.driver.getCurrentUrl();
    }

    public WebElement addToCart2(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-4\"]"));
    }

    public WebElement msgDisplayed(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/text()"));
    }

    public WebElement shoppingCartIconInc(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"cart-qty\"]"));
    }

}
