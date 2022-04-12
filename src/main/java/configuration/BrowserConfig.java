package configuration;

import configuration.models.Environment;
import configuration.models.User;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrowserConfig {

    private static Logger log = LoggerFactory.getLogger("BrowserConfig.class");

    private String browserName;
    private String appUrl;
    private WebDriver driver;

    public BrowserConfig(Environment environmentModel) {
        browserName = environmentModel.getBrowser().getBrowserName();
        log.info("<<<<<<<<<<<<<<<<<<<<Browser initialized: " + this.browserName.toUpperCase());
        appUrl = environmentModel.getBrowser().getAppUrl();
        log.info("<<<<<<<<<<<<<<<<<<<<Website address retrieved: " + appUrl);
    }


    public WebDriver getDriver() {
        WebDriver driver;
        switch (this.browserName) {
            case "chrome":
                ChromeOptions optionsChrome = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                optionsChrome.addArguments("start-maximized");
                driver = new ChromeDriver(optionsChrome);
                driver.get(appUrl);
                break;
            case "firefox":
                FirefoxOptions optionsFirefox = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                optionsFirefox.addArguments("start-maximized");
                driver = new FirefoxDriver(optionsFirefox);
                driver.get(appUrl);
                break;
            default:
                InternetExplorerOptions optionsdefault = new InternetExplorerOptions();
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver(optionsdefault);
                driver.get(appUrl);
        }
        this.driver=driver;
        return this.driver;
    }
}
