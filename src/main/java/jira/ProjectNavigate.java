package jira;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProjectNavigate {
    static WebDriverWait wait;
    public static void navigateToProject(WebDriver driver) {
        //css-1rm27d1 - projects
        //sc-gldTML errIdA - class Jira
        //_18u0u2gc _1reo15vq _18m915vq _1bto1l2s - class project
        //createGlobalItem - id CREATE
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement projectsJira = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[1]/div/div[2]/main/div/div[1]/div[2]/div/div[1]/a[1]/div/div[1]")));
        projectsJira.click();

        WebElement project = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ak-main-content\"]/span/div/div[4]/table/tbody/tr/td[2]/div/a/span")));
        project.click();

        WebElement create = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"createGlobalItem\"]/span")));
        create.click();

    }
}
