package configuration.model;

import lombok.Data;

@Data
public class Environment {
    private String message;
    private User user;

    public Environment() {
    }

    public Environment(String message, User user) {
        this.message = message;
        this.user = user;
    }
}