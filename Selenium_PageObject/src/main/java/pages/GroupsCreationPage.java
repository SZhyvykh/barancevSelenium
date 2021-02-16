package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ApplicationHelper;

public class GroupsCreationPage extends ApplicationHelper {
    private By groupNameField = By.name("group_name");
    private By groupHeaderField = By.name("group_header");
    private By groupFooterField = By.name("group_footer");
    private By submitButton = By.name("submit");
    private By groupCreatedText = By.xpath("//div[@class='msgbox']");
    private By updateButton = By.name("update");

    public void clickUpdateButton() {
        click(updateButton);
    }


    public GroupsCreationPage(WebDriver driver) {
        super(driver);
    }

    public void enterGroupName(String name) {
        enterText(groupNameField, name);
    }

    public void enterGroupHeader(String header) {
        enterText(groupHeaderField, header);
    }

    public void enterGroupFooter(String footer) {
        enterText(groupFooterField, footer);

    }

    public void clickEnterInformationButton() {
        click(submitButton);
    }

    public String verifyCreatedGroupText() {
        return driver.findElement(groupCreatedText).getText();
    }

    public void clickReturnToGroupPage() {
        clickReturnToGroupPageLink();
    }

}
