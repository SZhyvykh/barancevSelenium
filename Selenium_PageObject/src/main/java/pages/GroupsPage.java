package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ApplicationHelper;

public class GroupsPage extends ApplicationHelper {
    private By newGroupButton = By.name("new");
    private By selectGroup = By.name("selected[]");
    private By deleteGroupButton = By.name("delete");
    private By groupDeletedText = By.xpath("//div[@class='msgbox']");
    private By groupPageLink = By.linkText("group page");


    public GroupsPage(WebDriver driver) {
        super(driver);
    }

    public GroupsCreationPage clickNewGroupButton() {
        click(newGroupButton);
        return new GroupsCreationPage(driver);
    }

    public void clickSelectGroupCheckbox() {
        click(selectGroup);
    }

    public void clickDeleteGroupButton() {
        click(deleteGroupButton);
    }

    public String verifyDeletedGroupText() {
        return driver.findElement(groupDeletedText).getText();
    }

    public void clickReturnToGroupPage() {
        click(groupPageLink);
    }
}
