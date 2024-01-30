package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {
    static WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    @BeforeAll
    public static void setUp() {

        Configuration.browserSize = webDriverConfig.getBrowserSize();
        Configuration.browserVersion = webDriverConfig.getBrowserVersion();
        Configuration.browser = webDriverConfig.getBrowser();
        if (webDriverConfig.isRemote() != null) {
            Configuration.remote = webDriverConfig.remoteBrowserUrl();
        }
        Configuration.pageLoadStrategy = webDriverConfig.getPageLoadStr();
    }

    @BeforeEach
    public void beforeEach() {
        Configuration.baseUrl = webDriverConfig.getBaseUrl();
        Selenide.open("");
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}