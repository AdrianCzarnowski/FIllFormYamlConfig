import configuration.factory.BrowserFactory;
import configuration.factory.EnvironmentFactory;
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
    private static BrowserFactory browserFactory;
    public static Environment environment;

    @BeforeAll
    static void beforeAll() {
        environment = EnvironmentFactory.getInstance();
        browserFactory = new BrowserFactory(environment.getBrowser());
        driver = browserFactory.getDriver();
    }

    public static EnvironmentFactory getEnvironment() {
        return environment;
    }

    @AfterEach
    void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
        log.info("<<<<<<<<<<<<<<Driver CLOSE<<<<<<<<<<<<<<<<");
    }
}




