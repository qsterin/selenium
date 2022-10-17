import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class CardTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll{
        System.setProperty("webdriver.chrome.driver","driver/chromedriver");
    }

}
