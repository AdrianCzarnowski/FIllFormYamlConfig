package configuration.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;

public class Config {
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
    }
}
