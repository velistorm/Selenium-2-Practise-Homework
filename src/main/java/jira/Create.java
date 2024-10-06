package jira;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Create {
    static WebDriverWait wait;

    public static void choosingBug(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement clickOnIssueType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"issue-create.ui.modal.create-form.type-picker.issue-type-select\"]/div/div[2]/div/span/span")));
        clickOnIssueType.click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement bugOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"react-select-6-option-1\"]")));
        bugOption.click();

    }

    public static void choosingStory(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement clickOnIssueType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"issue-create.ui.modal.create-form.type-picker.issue-type-select\"]/div/div[2]/div/span/span")));
        clickOnIssueType.click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement storyOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"react-select-6-option-2\"]")));
        storyOption.click();
    }

    public static void summary(String summaryInput, WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement summary = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"summary-field\"]")));
        summary.click();
        summary.sendKeys(summaryInput);
    }

    public static void priority(String priorityInput, WebDriver driver) {
        // //*[@id="priority-container"]/div/div[1]/div/div/div[1]/div[2] -- priority
        // //*[@id="react-select-7-option-0"] - highest
        // //*[@id="react-select-7-option-1"]/div/div[2]/div  -- high
        // //*[@id="react-select-7-option-3"]/div/div[2]/div  -- low
        // //*[@id="react-select-7-option-4"]/div/div[2]/div  -- lowest

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement clickOnPriority = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"priority-container\"]/div/div[1]/div/div")));
        clickOnPriority.click();

        switch (priorityInput) {
            case "Highest":
                WebElement clickOnHighest = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-7-option-0\"]")));
                clickOnHighest.click();
                break;

            case "High":
                WebElement clickOnHigh = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-16-option-1\"]/div/div[2]/div")));
                clickOnHigh.click();
                break;
            case "Low":
                WebElement clickOnLow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-7-option-2\"]")));
                clickOnLow.click();
                break;
            case "Lowest":
                WebElement clickOnLowest = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-select-7-option-3\"]")));
                clickOnLowest.click();
                break;
        }
    }

    public static void relation(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement clickOnRelation = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"issuelinks-container\"]/div/div/div/div[1]/div/div")));
        clickOnRelation.click();
        WebElement chooseIsBlockedBy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"react-select-31-option-1\"]")));
        chooseIsBlockedBy.click();
    }

    public static void chooseIssueForRelation(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement clickOnIssue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"issuelinks-container\"]/div/div/div/div[2]/div/div/div")));
        clickOnIssue.click();
        WebElement choose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"react-select-32-option-0-0\"]")));
        choose.click();
    }

    public static void createIssue(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement clickOnCreate = driver.findElement(By.className("css-1jk3zmn"));
        //WebElement clickOnCreate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"react-select-6-option-2\"]/div")));
        clickOnCreate.click();
    }

}
