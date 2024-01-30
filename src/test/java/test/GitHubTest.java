package test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class GitHubTest extends BaseTest {

    @Test
    @Tag("homePage")
    @DisplayName("Checking the title on the main page GitHub")
    void checkGitHomePageTitleTest() {
        $(".h0-mktg.mb-3.position-relative.z-2").shouldHave(Condition.text("Let’s build from here"));
    }

    @Test
    @Tag("signInPage")
    @DisplayName("Checking the title on the login page GitHub")
    void checkTitleInSignInPageGitHubTest() {
        $(".position-relative.mr-lg-3.d-lg-inline-block [href='/login']").click();
        $("#login").shouldHave(Condition.text("Sign in to GitHub"));
    }

    @Test
    @Tag("readMePage")
    @DisplayName("Checking the title of the article on the page README GitHub")
    void checkArticleTitleInGitHubReadMePageTest() {
        $(".d-lg-flex.list-style-none").$(byText("Open Source")).hover();
        $("[href='/readme']").click();
        $(".readme-heading-1.readme-heading--condensed.mb-6").shouldHave(Condition.text("ReadMe Project"));

    }
}
