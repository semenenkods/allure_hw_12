package allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;


public class AllureStepsTest {

    private static final String REPOSITORY = "semenenkods/allure_hw_12";
    private static final int ISSUE = 1;

        @Test
        public void testAnnotatedStep(){

        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.openIssueTab();
        steps.issueWithNumberShouldExist(ISSUE);


    }
}
