package configuration;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import configuration.models.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;



public class YamlReader {

    public Config getConfig() {
        return config;
    }

    Config config;

    public YamlReader() {

        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            this.config = mapper.readValue(new File("src/main/resources/config.yaml"), Config.class);
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




