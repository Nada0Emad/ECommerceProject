package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class P10_AddProductToWishlist {

   public WebElement addProductToWishlist(){
       return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/h2/a"));
   }
   public WebElement clickHeartIcon(){
       return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
   }
}
