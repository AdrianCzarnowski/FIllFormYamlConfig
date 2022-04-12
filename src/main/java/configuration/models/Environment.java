package configuration.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Environment {
    private String envName;
    private User user;

    public Environment() {
    }

    public Environment(String envName, User user) {
        this.envName = envName;
        this.user = user;
    }
}