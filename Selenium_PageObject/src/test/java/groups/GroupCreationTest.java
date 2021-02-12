package groups;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTest extends BaseTest {

    @Test
    public void testCreationGroup() {
       var groupsPage =  mainPage.clickGroupsLink();
       var groupCreationPage =  groupsPage.clickNewGroupButton();
       groupCreationPage.enterGroupName("Group 1");
       groupCreationPage.enterGroupHeader("Group header 1");
       groupCreationPage.enterGroupFooter("Group footer 1");
       groupCreationPage.clickEnterInformationButton();
       Assert.assertTrue(groupCreationPage.verifyCreatedGroupText().contains("A new group has been entered into the address book."),
                                                                      "Group was not created");
       groupCreationPage.clickReturnToGroupPage();


    }
}
