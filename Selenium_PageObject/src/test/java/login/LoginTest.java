package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        loginPage.enterUserName("admin");
        loginPage.enterPassword("secret");
        var mainPage = loginPage.clickLoginButton();
        assertEquals(mainPage.getTitle(), "Address book");



    }
}
