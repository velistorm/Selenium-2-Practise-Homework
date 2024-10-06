package base;

import driver.DriverManager;
import driver.ElementPresense;
import google.BaseGoogle;
import google.Cookies;
import google.SearchPage;
import jira.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseTest {
    DriverManager driver;
    private static final Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeAll
    public static void setUp() {
        WebDriver driver = DriverManager.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get(BaseGoogle.getUrl());
        Cookies.clickCookies(driver);

        SearchPage.search(DriverManager.getDriver());
        SearchPage.getFirstResult(DriverManager.getDriver());

        BasePage.loginForm("petevvelislav@gmail.com", "TelerikHomework",DriverManager.getDriver());
    }

    //@AfterEach
    //public void tearDown() {
        //DriverManager.quitDriver();
    //}
}
