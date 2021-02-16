package contacts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTest extends BaseTest {

    @Test
    public void testContactCreation() {
        var addNewContact = mainPage.clickAddNewLink();
        addNewContact.enterFirstName("Sir");
        addNewContact.enterLastName("Alex");
        addNewContact.enterAddress("123 test drive");
        addNewContact.enterEmail("sirAlex@test.com");
        addNewContact.clickEnterButton();
        Assert.assertTrue(addNewContact.verifyCreatedContact().contains("Information entered into address book."),
                "Contact has not created");
        addNewContact.returnToHomePage();

    }
}
