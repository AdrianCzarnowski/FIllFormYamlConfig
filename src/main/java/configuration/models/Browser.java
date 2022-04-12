package configuration.models;


import lombok.Data;

@Data
public class Browser {

    private String browserName;
    private String appUrl;

    public Browser() {
    }
}
