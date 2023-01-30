package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_FilterTags {
    public WebElement productImage(){
        return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000024_apple-macbook-pro-13-inch_415.jpeg\"]"));
    }

    public WebElement specificTag(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/computer\"]"));
    }

    public String tagPageNav(){
        return Hooks.driver.getCurrentUrl();
    }

    public WebElement msgDisplayed(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1"));
    }
}
