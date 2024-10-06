package jira;

import driver.ElementPresense;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    static WebDriverWait wait;
    public static void loginForm(String emailInput, String passwordInput, WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signIn = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("sign-in")));
        signIn.click();

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        email.sendKeys(emailInput);

        WebElement contineLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-submit")));
        contineLogin.click();

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        password.sendKeys(passwordInput);

        WebElement loginSubmit = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-submit")));
        loginSubmit.click();

        if (ElementPresense.isElementPresent(By.id("mfa-promote-dismiss"), wait)) {
            WebElement no2Step = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mfa-promote-dismiss")));
            no2Step.click();
        } else {
            System.out.println("2FA message not found, proceeding with the test.");
        }
    }
}
