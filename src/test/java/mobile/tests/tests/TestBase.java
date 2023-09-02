package mobile.tests.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.selenide.AllureSelenide;
import mobile.tests.drivers.BrowserstackDriver;
import mobile.tests.drivers.LocalMobileDriver;
import mobile.tests.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static mobile.tests.helpers.Attach.getSessionId;

public class TestBase {
    public static String testType = System.getProperty("testType");

    @BeforeAll
    public static void setup() {
        if (testType == null) {
            testType = "local";
        }

        switch (testType) {
            case "local":
                Configuration.browser = LocalMobileDriver.class.getName();
                System.out.println("local test start");
                break;
            case "browserstack":
                Configuration.browser = BrowserstackDriver.class.getName();
                System.out.println("remote test start");
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void tearDown() {
        String sessionId = getSessionId();

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        closeWebDriver();

        switch (testType) {
            case "browserstack":
                Attach.video(sessionId);
                break;
        }
    }
}

