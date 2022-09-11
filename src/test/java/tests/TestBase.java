package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import drivers.BrowserStackMobileDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.OnBoardingPage;
import pages.SearchPage;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Attach.sessionId;
import static io.qameta.allure.Allure.step;


public class TestBase {
    static String deviceHost = System.getProperty("deviceHost", "remote");

    OnBoardingPage onBoardingPage = new OnBoardingPage();
    SearchPage searchPage = new SearchPage();

    @BeforeAll
    public static void setup() {
        if (Objects.equals(deviceHost, "local")) {
            Configuration.browser = LocalMobileDriver.class.getName();
        } else {
            Configuration.browser = BrowserStackMobileDriver.class.getName();
        }
        Configuration.browserSize = null;
        System.out.println(deviceHost);

    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.video(sessionId);
        step("Close driver", Selenide::closeWebDriver);
    }

}




