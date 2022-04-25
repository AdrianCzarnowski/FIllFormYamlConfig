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

        log.info("<<<<<<<<<<<<<<System get form data");

        FormPage formPage = new FormPage(driver);
        formPage.setFirstName(testData.get("firstName"))
                .setLastName(testData.get("lastName"))
                .setEmail(testData.get("email"))
                .setAge(testData.get("age"))
                .selectRandomGender()
                .selectRandomExperience()
                .selectRandomProfession()
                .selectContinents()
                .selectCommands()
                .inputFile()
                .clickSingInButton();
        assertThat(formPage.getValidationMsg(), equalTo(testData.get("validation")));
        log.info(VALIDATION_PASS);
    }
}
