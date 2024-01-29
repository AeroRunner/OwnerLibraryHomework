package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubPage {
    private final SelenideElement
            homePageTitleField = $(".h0-mktg.mb-3.position-relative.z-2"),
            loginButton = $(".position-relative.mr-lg-3.d-lg-inline-block [href='/login']"),
            loginPageTitleField = $(".auth-form-header.p-0"),
            productDropdownButton = $(".HeaderMenu-link.border-0.width-full.width-lg-auto.px-0." +
                    "px-lg-2.py-3.py-lg-2.no-wrap.d-flex.flex-items-center.flex-justify-between.js-details-target"),
            blogButton = $("[href='https://github.blog']"),
            blogTitleField = $(".d-flex.flex-items-center");

    public GitHubPage checkHomePageTitle(String title) {
        homePageTitleField.shouldHave(Condition.text(title));
        return this;
    }

    public GitHubPage clickLoginPage() {
        loginButton.click();
        return this;
    }

    public GitHubPage checkLoginPageTitle(String logTitle) {
        loginPageTitleField.shouldHave(Condition.text(logTitle));
        return this;
    }

    public GitHubPage productDropdownClick() {
        productDropdownButton.click();
        return this;
    }

    public GitHubPage blogButtonClick() {
        blogButton.click();
        return this;
    }

    public GitHubPage checkBlogTitle(String blogTitle) {
        blogTitleField.shouldHave(Condition.text(blogTitle));
        return this;
    }

}
