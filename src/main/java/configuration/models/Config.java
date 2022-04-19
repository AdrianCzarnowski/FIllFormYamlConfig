package configuration.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import configuration.factory.BrowserFactory;

import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.HashMap;

@Data
@NoArgsConstructor
public class Config {
    private String activeEnvironment;
    private BrowserFactory browser;
    @JsonAnyGetter
    private HashMap<String, Environment> environments;
}