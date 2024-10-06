package google;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class SearchPage {
    static WebDriverWait wait;

    public static void search(WebDriver driver) {

        wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        search.sendKeys("Jira");
        search.submit();
    }
    public static void getFirstResult(WebDriver driver) {
        List<WebElement> h3 = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h3")));
        WebElement firstResult = h3.get(0);
        firstResult.click();
    }
}
