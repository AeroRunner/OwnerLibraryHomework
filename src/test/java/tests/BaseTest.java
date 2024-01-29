package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import configs.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeAll
    public static void setUp() {
        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        Configuration.browser = webDriverConfig.getBrowser();
        Configuration.browserVersion = webDriverConfig.getBrowserVersion();
        if (!"".equals(webDriverConfig.getRemoteWebDriver())) {
            Configuration.remote = webDriverConfig.getRemoteWebDriver();
        }
        String baseUrlOfPage = System.getProperty("base.url");
        if (Objects.isNull(baseUrlOfPage)) {
            baseUrlOfPage = "https://github.com/";
        }
        Configuration.browser = webDriverConfig.getBrowser();
        Configuration.browserVersion = webDriverConfig.getBrowserVersion();
        open(baseUrlOfPage);
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}
