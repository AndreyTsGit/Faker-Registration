package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
    String firstName = "Andy",
            lastName = "Ts",
            userEmail = "mail@mail.com";

    @BeforeEach
    void prepareTestData () {
        firstName = "Andy";
        lastName = "Ts";
        userEmail = "mail@mail.com";
    }

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "860x720";
        // Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        // Configuration.holdBrowserOpen;

    }
}
