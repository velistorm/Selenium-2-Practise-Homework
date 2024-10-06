package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {
    private static WebDriver driver;

    // Method to initialize and return WebDriver instance
    public static WebDriver getDriver() {
        if (driver == null) {
            // Here you can choose the browser dynamically if needed, e.g., Chrome or Firefox
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Path to your ChromeDriver
            driver = new ChromeDriver(); // Or new FirefoxDriver() for Firefox

            // Basic driver setup (timeouts, maximize window, etc.)
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
            driver.manage().window().maximize(); // Maximize window
        }
        return driver;
    }
    public static WebDriverWait getWait(WebDriver driver, int timeoutInSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
    }

    // Method to close and quit the driver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
