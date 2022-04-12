package configuration.models;


import java.util.HashMap;

public class YamlHandler {

    public YamlHandler() {
    }

    private Browser browser;
    private String actualEvn;
    private HashMap<String, Environment> environments;

    public YamlHandler(Browser browser, String actualEvn, HashMap<String, Environment> environments) {
        this.browser = browser;
        this.actualEvn = actualEvn;
        this.environments = environments;
    }


    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public String getActualEvn() {
        return actualEvn;
    }

    public void setActualEvn(String actualEvn) {
        this.actualEvn = actualEvn;
    }

    public HashMap<String, Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(HashMap<String, Environment> environments) {
        this.environments = environments;
    }

}
