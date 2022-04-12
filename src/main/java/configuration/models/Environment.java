package configuration.models;


public class Environment {
    private String envName;
    private Browser browser;
    private User user;


    public Browser getBrowser() {
        return browser;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}