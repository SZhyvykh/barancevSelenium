package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    private String url;
    protected MainPage mainPage;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        url = "http://localhost/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        loginPage.enterUserName("admin");
        loginPage.enterPassword("secret");
        loginPage.clickLoginButton();
       // System.out.println(driver.getTitle());
        mainPage = new MainPage(driver);


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
