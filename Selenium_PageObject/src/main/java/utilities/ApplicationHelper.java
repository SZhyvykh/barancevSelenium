package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationHelper {
    protected WebDriver driver;


    public ApplicationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }



}
