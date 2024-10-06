package base;

import driver.DriverManager;
import jira.Create;
import jira.ProjectNavigate;
import org.junit.jupiter.api.Test;

public class CreateStoryTest extends BaseTest {
    @Test
    public void testChoosingStory() {
        ProjectNavigate.navigateToProject(DriverManager.getDriver());
        Create.choosingStory(DriverManager.getDriver());
        Create.summary("Story Creation Test", DriverManager.getDriver());
        Create.priority("High", DriverManager.getDriver());
        Create.createIssue(DriverManager.getDriver());

    }
}
