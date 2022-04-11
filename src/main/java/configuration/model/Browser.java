package configuration.model;


import lombok.Data;

@Data
public class Browser {

    private String browserName;
    private String appUrl;

    public Browser() {
    }
}
