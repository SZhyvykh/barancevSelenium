package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationHelper {
    private By groupPageLink = By.linkText("group page");

    protected WebDriver driver;

    public ApplicationHelper(WebDriver driver) {
        this.driver = driver;
    }


    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void enterText(By locator, String text) {
        if (text != null) {
            String existingValue = driver.findElement(locator).getAttribute("value");
            if(!text.equals(existingValue)) {
               click(locator);
               driver.findElement(locator).clear();
               driver.findElement(locator).sendKeys(text);
            }

        }

    }

    protected void clickReturnToGroupPageLink() {
        click(groupPageLink);
    }



}
