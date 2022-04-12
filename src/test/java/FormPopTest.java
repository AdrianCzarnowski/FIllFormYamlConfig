import configuration.models.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.FormPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FormPopTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("FormPopTest.class");

    @Test
    public void shouldFIllFormWithSuccess() {

        FormPage formPage = new FormPage(driver);
        User user = getEnvironmentModel().getUser();
        formPage.setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setEmail(user.getEmail())
                .setAge(user.getAge())
                .selectRandomGender()
                .selectRandomExperience()
                .selectRandomProfession()
                .selectContinents()
                .selectCommands()
                .setFile()
                .setSingInButton();
        assertThat("Wrong validator message", formPage.getValidationMsg(), equalTo(user.getValidation()));
        log.info(VALIDATION_PASS);
    }
}
