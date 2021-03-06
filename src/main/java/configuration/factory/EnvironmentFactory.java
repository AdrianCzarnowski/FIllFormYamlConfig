package configuration.factory;

import configuration.reader.YamlReader;
import configuration.models.Config;
import configuration.models.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class EnvironmentFactory {

    private static Logger log = LoggerFactory.getLogger("EnvironmentFactory.class");

    public static Environment getInstance() {
        return EnvironmentFactory.EnvironmentPropertySingleton.INSTANCE;
    }

    private static class EnvironmentPropertySingleton {
        private static final Environment INSTANCE = loadConfig();
    }

    public static Environment loadConfig() {

        YamlReader yamlReader = new YamlReader();
        Config config = yamlReader.getConfig();
//        HashMap<String, Object> user = environment.getUser();

        try {
            String activeEnvironment = config.getActiveEnvironment();
            log.info("<<<<<<<<<<<<<<<<<<<Active environment founded name: " + activeEnvironment.toUpperCase());
            return config.getEnvironments().get(activeEnvironment);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Environment getConfig() {
        return getInstance();
    }
}