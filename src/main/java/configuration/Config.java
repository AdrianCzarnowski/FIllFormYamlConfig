package configuration;

import org.openqa.selenium.remote.Browser;
import sun.tools.java.Environment;

public class Config {
    public Environment environment;
    public Browser browser;

    public Environment getEnvironment() {
        return environment;
    }

    public Browser getBrowser() {
        return browser;
    }
}
