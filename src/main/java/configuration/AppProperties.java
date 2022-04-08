package configuration;

import configuration.model.EnvironmentModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AppProperties {

    private static Logger log = LoggerFactory.getLogger("AppProperties.class");

    public AppProperties () {
        setSystemPropertiesFromYamlEnvironment();
    }

    private void setSystemPropertiesFromYamlEnvironment() {
        YamlReader yamlReader = new YamlReader();
        List<EnvironmentModel> listOfEnvironments = yamlReader.getConfig().getEnvironment().getListOfEnvironments();
    }
}
