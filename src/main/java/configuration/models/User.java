package configuration.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public User (){
    }
}
