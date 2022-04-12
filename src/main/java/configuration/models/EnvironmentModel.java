package configuration.models;

import configuration.BrowserConfig;
import configuration.YamlReader;

public class EnvironmentModel {
    private YamlHandler yamlHandler;
    private BrowserConfig browserConfig;
    private Environment environment;
    private YamlReader yamlReader;
    private String envName;

    public EnvironmentModel(){
        yamlReader = new YamlReader();

    }
    public static EnvironmentModel getInstance() {
        return EnvironmentModel.EnvironmentPropertySingleton.INSTANCE;
    }

        private static class EnvironmentPropertySingleton {
        private static final EnvironmentModel INSTANCE = new EnvironmentModel();
    }

}
