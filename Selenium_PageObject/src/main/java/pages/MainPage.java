package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage {
    private By logo =By.cssSelector("#logo");
    private WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
      return driver.getTitle();


    }


}
