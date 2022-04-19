import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.FormPage;

import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FormPopTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("FormPopTest.class");

    @Test
    public void shouldFIllFormWithSuccess() {
        HashMap<String, Object> user = environmentFactory.getUser();

        FormPage formPage = new FormPage(driver);
        formPage.setFirstName((String) user.get("firstName"))
                .setLastName((String) user.get("lastName"))
                .setEmail((String) user.get("email"))
                .setAge((Integer) user.get("age"))
                .selectRandomGender()
                .selectRandomExperience()
                .selectRandomProfession()
                .selectContinents()
                .selectCommands()
                .setFile()
                .setSingInButton();
        assertThat(formPage.getValidationMsg(), equalTo((String) user.get("validation")));
        log.info(VALIDATION_PASS);
    }
}
