package base;

import driver.DriverManager;
import jira.Create;
import jira.ProjectNavigate;
import org.junit.jupiter.api.Test;

public class CreateBugTest extends BaseTest {
    @Test
    public void testChoosingBug() {
        ProjectNavigate.navigateToProject(DriverManager.getDriver());
        Create.choosingBug(DriverManager.getDriver());
        Create.summary("Bug Creation Test", DriverManager.getDriver());
        Create.priority("Highest", DriverManager.getDriver());
        Create.createIssue(DriverManager.getDriver());
    }
}
