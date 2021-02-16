package groups;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GroupsCreationPage;

public class GroupModificationTest extends BaseTest {

    @Test
    public void testModificationGroup() {
       var groupsPage= mainPage.clickGroupsLink();
       groupsPage.clickSelectGroupCheckbox();
       var groupsCreationPage= groupsPage.clickEditGroupButton();
       groupsCreationPage.enterGroupName("Update Group");
       groupsCreationPage.enterGroupHeader("New header");
       groupsCreationPage.enterGroupFooter("Updated footer");
       groupsCreationPage.clickUpdateButton();
       Assert.assertTrue(groupsCreationPage.verifyCreatedGroupText().contains("Group record has been updated."),
               "Group did not update");
       groupsCreationPage.clickReturnToGroupPage();


    }

}
