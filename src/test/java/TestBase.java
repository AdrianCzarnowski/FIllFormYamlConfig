
import configuration.BrowserConfig;
import configuration.EnvironmentFactory;
import configuration.models.Environment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {

    private static Logger log = LoggerFactory.getLogger("TestBase.class");
    public static final String VALIDATION_PASS = "♛♛♛♛♛♛♛♛♛♛♛♛♛VALIDATION PASS♛♛♛♛♛♛♛♛♛♛♛♛♛";
    protected static WebDriver driver;
    private static BrowserConfig browserConfig;
    public static Environment environmentFactory;


    @BeforeAll
    static void beforeAll() {
        environmentFactory = EnvironmentFactory.getInstance();
        browserConfig = new BrowserConfig(environmentFactory.getBrowser());
        driver = browserConfig.getDriver();
    }
    public static EnvironmentFactory getEnvironment() {
        return environmentFactory;
    }

    @AfterEach
    void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
        log.info("<<<<<<<<<<<<<<Driver CLOSE<<<<<<<<<<<<<<<<");
    }
}




