package com.homework1.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("sandumi");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("login-button")).click();
        try {
            Thread.sleep(2000);      // Used only to show the process clearly.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         driver.quit();
    }


}
