package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;
    private By userName = By.name("user");
    private By password = By.name("pass");
    private By loginButton = By.xpath("//input[@type='submit']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String username) {
        driver.findElement(userName).sendKeys(username);

    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public MainPage clickLoginButton() {
        driver.findElement(loginButton).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        return new MainPage(driver);
    }
}
