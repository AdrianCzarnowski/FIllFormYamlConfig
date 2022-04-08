package configuration;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppProperties {

    private static Logger log = LoggerFactory.getLogger("AppProperties.class");

    public AppProperties () {
        setSystemPropertiesFromYamlEnvironment();
    }

    private void setSystemPropertiesFromYamlEnvironment() {
        YamlReader yamlReader = new YamlReader();
            }

        }


