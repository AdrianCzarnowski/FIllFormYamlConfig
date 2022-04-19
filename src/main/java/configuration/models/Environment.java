package configuration.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import configuration.factory.EnvironmentFactory;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
@Data
@NoArgsConstructor
public class Environment extends EnvironmentFactory {
    private Browser browser;
    @JsonAnyGetter
    private HashMap<String, Object> user;
}



