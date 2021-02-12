package groups;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTest extends BaseTest {

    @Test
    public void testGroupDeletion() {
       var groupPage = mainPage.clickGroupsLink();
        groupPage.clickSelectGroupCheckbox();
        groupPage.clickDeleteGroupButton();
        Assert.assertTrue(groupPage.verifyDeletedGroupText().contains("Group has been removed."),
                "Group has not removed");

    }
}
