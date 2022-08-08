package com.homework1.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;
import static org.assertj.core.api.Assertions.*;

public class Login2 {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.firefoxdriver().setup();
        // WebDriverManager.safaridriver().setup();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
       // driver = new SafariDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {

        if (driver != null) {
            driver.close();
        }
    }

    @Test
    public void testLoginWithValidUserNameAndValidPassword() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).isDisplayed();
        driver.findElement(By.id("login-button")).click();
        String actualTitle = driver.findElement(By.className("title")).getText();
        assertThat(actualTitle).isEqualTo("PRODUCTS");
    }


    @Test
    public void testLoginWithValidUserNameAndInvalidPassword() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("Secret_Sauce");
        driver.findElement(By.id("login-button")).isDisplayed();
        driver.findElement(By.id("login-button")).click();
       // assertThat(driver.findElement(By.className("error-message-container error")).isDisplayed());

    }

    @Test
    public void testLoginWithInvalidUserNameAndValidPassword() {
        driver.findElement(By.id("user-name")).sendKeys("Standard_Users");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).isDisplayed();
        driver.findElement(By.id("login-button")).click();
        // assertThat(driver.findElement(By.className("error-message-container error")).isDisplayed());
    }

    @Test
    public void testLoginWithInvalidUserNameAndInvalidPassword() {
        driver.findElement(By.id("user-name")).sendKeys("Standard_Users");
        driver.findElement(By.id("password")).sendKeys("Secret_Sauce");
        driver.findElement(By.id("login-button")).isDisplayed();
        driver.findElement(By.id("login-button")).click();
        // assertThat(driver.findElement(By.className("error-message-container error")).isDisplayed());
    }

    @Test
    public void testLoginWithEmptyUserNameAndPasswordFields() {
        driver.findElement(By.id("login-button")).isDisplayed();
        driver.findElement(By.id("login-button")).click();
        // assertThat(driver.findElement(By.className("error-message-container error")).isDisplayed());
    }
}