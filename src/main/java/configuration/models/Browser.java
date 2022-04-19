package configuration.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Browser {
    private String browserName;
    private String appUrl;
}
