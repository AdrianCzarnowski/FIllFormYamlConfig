package configuration;

import configuration.models.Config;
import configuration.models.Environment;

public class EnvironmentFactory {



    public static Environment getInstance() {
        return EnvironmentFactory.EnvironmentPropertySingleton.INSTANCE;
    }

        private static class EnvironmentPropertySingleton {
        private static final Environment INSTANCE = loadConfig();
    }

    public static Environment loadConfig (){
        YamlReader yamlReader = new YamlReader();
        Config config = yamlReader.getConfig();
        String activeEnvironment = config.getActiveEnvironment();
        return config.getEnvironments().get(activeEnvironment);
    }

}
