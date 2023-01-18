package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.awt.font.TextMeasurer;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    SoftAssert soft = new SoftAssert();


    @BeforeAll
    public static void OpenBrowser(){
        System.setProperty("webdriver.chrom.driver", "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2022.3.1\\FinalProject\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterAll
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
