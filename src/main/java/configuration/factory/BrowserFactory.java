package configuration.factory;

import configuration.models.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrowserFactory extends Browser {

    private static Logger log = LoggerFactory.getLogger("BrowserConfig.class");

    private String browserName;
    private String appUrl;
    private WebDriver driver;

    public BrowserFactory(Browser browser) {

        try {
            browserName = browser.getBrowserName();
            log.info("<<<<<<<<<<<<<<<<<<<<Browser initialized: " + this.browserName.toUpperCase());
            appUrl = browser.getAppUrl();
            log.info("<<<<<<<<<<<<<<<<<<<<Website address retrieved: " + appUrl);
        } catch (WebDriverException exception) {
            return;
        }
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
