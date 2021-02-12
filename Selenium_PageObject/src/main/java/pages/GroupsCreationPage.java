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
    private By groupPageLink = By.linkText("group page");



    public GroupsCreationPage(WebDriver driver) {
        super(driver);
    }

    public void enterGroupName(String name) {
        click(groupNameField);
        driver.findElement(groupNameField).sendKeys(name);
    }

    public void enterGroupHeader(String header) {
        click(groupHeaderField);
        driver.findElement(groupHeaderField).sendKeys(header);
    }

    public void enterGroupFooter(String footer) {
        click(groupFooterField);
        driver.findElement(groupFooterField).sendKeys(footer);

    }

    public void clickEnterInformationButton() {
        click(submitButton);
    }

    public String verifyCreatedGroupText() {
        return driver.findElement(groupCreatedText).getText();
    }

    public void clickReturnToGroupPage() {
        click(groupPageLink);
    }

}
