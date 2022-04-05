import org.junit.jupiter.api.Test;
import pages.FormPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FormPopTest extends TestBase {
    @Test
    public void  shouldFIllFormWithSuccess()  {
        driver.get(URL);
        FormPage formPage = new FormPage(driver);
        formPage.setFirstName("Jan")
                .setLastName("Nowak")
                .setEmail("jannowak@wp.pl")
                .setAge(20)
                .selectRandomGender()
                .selectRandomExperience()
                .selectRandomProfession()
                .selectContinents()
                .selectCommands()
                .setFile()
                .setSingInButton();
        assertThat("Wrong validator message", formPage.getValidationMsg(), equalTo("Form send with success"));
    }
}
