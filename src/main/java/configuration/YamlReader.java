package configuration;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import configuration.models.Environment;
import configuration.models.User;
import configuration.models.YamlHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class YamlReader {

    public Environment getConfig(YamlHandler yamlFile, String envName) {
        Environment environment = yamlFile.getEnvironments().get(envName);
        return environment;
    }

    public YamlReader() {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            File file = new File(classLoader.getResource("config.yaml").getFile());
            ObjectMapper om = new ObjectMapper(new YAMLFactory());
            User user = om.readValue(file, User.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
