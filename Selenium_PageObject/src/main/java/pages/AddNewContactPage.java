package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ApplicationHelper;

public class AddNewContactPage extends ApplicationHelper {
    private By firstNameField = By.name("firstname");
    private By lastNameField = By.name("lastname");
    private By addressField = By.name("address");
    private By emailField = By.name("email");
    private By enterButton = By.name("submit");
    private By textOfCreatedContact = By.xpath("//div[@class='msgbox']");
    private By homePageLink = By.linkText("home page");


    public AddNewContactPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String name) {
        enterText(firstNameField, name);
    }

    public void enterLastName(String lastName) {
        enterText(lastNameField, lastName);
    }

    public void enterAddress(String address) {
        enterText(addressField, address);
    }

    public void enterEmail(String email) {
        enterText(emailField, email);
    }

    public void clickEnterButton() {
        click(enterButton);
    }

    public String verifyCreatedContact() {
        return driver.findElement(textOfCreatedContact).getText();
    }

    public void returnToHomePage() {
        click(homePageLink);
    }




}
