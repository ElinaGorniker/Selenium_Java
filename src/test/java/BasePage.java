import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static java.sql.DriverManager.getDriver;

public class BasePage {
    WebDriver driver;
    public BasePage() {
        this.driver = BaseTest.getDriver();
        PageFactory.initElements(driver, this);
}
