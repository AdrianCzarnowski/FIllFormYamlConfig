package configuration.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class Config {

    private static Logger log = LoggerFactory.getLogger("Config.class");

    public Config(){
    }
    public HashMap<String, Environment> getEnvironments() {
        return environments;
    }

    public String getActiveEnvironment() {
        return activeEnvironment;
    }

    String activeEnvironment;
    @JsonAnyGetter
    private HashMap<String, Environment> environments;

    public void setEnvironments(HashMap<String, Environment> environments) {
        this.environments = environments;
        log.info("<<<<<<<<<<<<<<<<<<<Number of test environments available: " + environments.size());
    }
}
