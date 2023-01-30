package org.example.pages;

import io.cucumber.java.en.When;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P11_AddProductToCompareList {

    public WebElement compareIconClicked(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[2]"));
    }
   public WebElement compareMsg(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p"));
   }
}
