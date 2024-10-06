package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cookies {
    public static void clickCookies(WebDriver driver){
        WebElement button = driver.findElement(By.id("L2AGLb"));
        button.click();
    }
}
