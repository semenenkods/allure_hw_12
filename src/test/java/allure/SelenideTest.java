package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {
    @Test
    @DisplayName("Search of issue in the repository")
    public void testIssueSearch() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");
        $(".search-input").click();
        $("#query-builder-test").sendKeys("semenenkods/allure_hw_12");
        $("#query-builder-test").pressEnter();
        $(linkText("semenenkods/allure_hw_12")).click();
        $("#issues-tab").click();
        $(withText("#1")).should(Condition.exist);


    }
}
