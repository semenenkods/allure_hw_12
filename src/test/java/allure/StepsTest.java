package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class StepsTest {

    private static final String REPOSITORY = "semenenkods/allure_hw_12";
    private static final int ISSUE = 1;

    @Test
    @DisplayName("Search of issue in the repository")
    public void testLambdaStep() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open main page",  () -> {
            open("https://github.com");
        });

        step("Repository search" + REPOSITORY, () -> {
            $(".search-input").click();
            $("#query-builder-test").sendKeys(REPOSITORY);
            $("#query-builder-test").pressEnter();
        });
        step("Click on the repository link" + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Open the issue tab", () -> {
            $("#issues-tab").click();
        });
        step("Verify if issue with number " + ISSUE + "exist", () -> {
            $(withText("#" + ISSUE)).should(Condition.exist);
        });



    }
}
