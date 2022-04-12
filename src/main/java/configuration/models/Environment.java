package configuration.models;



public class Environment {
    private String envName;
    private User user;

    public Environment(String envName, User user) {
        this.envName = envName;
        this.user = user;
    }

    public Environment() {
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