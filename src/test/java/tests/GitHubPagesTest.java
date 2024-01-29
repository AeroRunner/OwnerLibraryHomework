package tests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.GitHubPage;
import utils.GitHubData;


public class GitHubPagesTest extends BaseTest {
    GitHubPage git = new GitHubPage();
    GitHubData data = new GitHubData();

    @Tag("home")
    @Test
    @DisplayName("Checking the title on the main page")
    public void testGitHomePage() {
        git.checkHomePageTitle(data.homePageTitle);
    }

    @Tag("login")
    @Test
    @DisplayName("Checking the title on the login page")
    public void testLoginGit() {
        git.clickLoginPage();
        git.checkLoginPageTitle(data.signPageTitle);
    }

    @Tag("blog")
    @Test
    @DisplayName("Сheck the blog section")
    public void testPriceGit() {
        git.productDropdownClick();
        git.blogButtonClick();
        git.checkBlogTitle(data.blogPageTitle);
    }
}
