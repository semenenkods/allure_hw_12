package allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {
    @Test
    @DisplayName("Search of issue in the repository")
    public void testIssueSearch() {
        open("https://github.com");
        $(".search-input").click();

    }
}
