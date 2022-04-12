
import configuration.BrowserConfig;
import configuration.models.Environment;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {

    private static Logger log = LoggerFactory.getLogger("TestBase.class");
    protected static WebDriver driver;
    private static BrowserConfig browserConfig;
    private static Environment environment;


    @BeforeAll
    static void beforeAll() {
        environment = Environment.getInstance();
        browserConfig = new BrowserConfig();
        driver = browserConfig.getDriver();
    }



    @AfterEach
    void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
        log.debug("<<<<<<<<<<<<<<Driver CLOSE<<<<<<<<<<<<<<<<");
    }

}




