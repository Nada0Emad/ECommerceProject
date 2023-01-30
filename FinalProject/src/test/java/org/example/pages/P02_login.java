package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P02_login {
    public WebElement loginLink(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement validEmail(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement validPassword(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }

    public WebElement loginBtn(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1\"]"));
    }

    public WebElement validLogin(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
    public String currentUrl(){
        return Hooks.driver.getCurrentUrl();
    }

    public WebElement inValidEmail(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement errorLogin(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error\"]"));
    }


}
