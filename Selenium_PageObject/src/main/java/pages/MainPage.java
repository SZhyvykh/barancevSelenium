package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ApplicationHelper;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends ApplicationHelper {
    private By groupsLink = By.linkText("groups");

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


}
