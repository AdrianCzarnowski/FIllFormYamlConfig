package configuration.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import configuration.BrowserConfig;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.HashMap;

@Data
@NoArgsConstructor
public class Config {
    private static Logger log = LoggerFactory.getLogger("Config.class");

    private String activeEnvironment;
    private BrowserConfig browser;
    @JsonAnyGetter
    private HashMap<String, Environment> environments;
}