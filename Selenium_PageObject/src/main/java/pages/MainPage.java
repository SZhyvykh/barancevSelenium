package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ApplicationHelper;

public class MainPage extends ApplicationHelper {
    private By groupsLink = By.linkText("groups");
    private By addNewLink = By.linkText("add new");

    public MainPage(WebDriver driver)
    {
        super(driver);
    }

    public String getTitle() {
      return driver.getTitle();
    }

    public GroupsPage clickGroupsLink() {
        click(groupsLink);
        return new GroupsPage(driver);
    }

    public AddNewContactPage clickAddNewLink() {
        click(addNewLink);
        return new AddNewContactPage(driver);
    }


}
