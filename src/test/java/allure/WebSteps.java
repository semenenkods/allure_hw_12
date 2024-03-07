package allure;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step("Open main page")
    public void openMainPage(){
        open("https://github.com");
    }

    @Step("Repository search {repo}")
    public void searchRepository(String repo){
        $(".search-input").click();
        $("#query-builder-test").sendKeys(repo);
        $("#query-builder-test").pressEnter();
    }

    @Step("Click on the repository link {repo}")
    public void clickOnRepositoryLink(String repo){
        $(linkText(repo)).click();

    }

    @Step("Open the issue tab")
    public void openIssueTab(){
        $("#issues-tab").click();

    }

    @Step("Verify if issue with number {issue} exist")
    public void issueWithNumberShouldExist(int issue){

    }



}
