package com.example.utils.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class TestConfiguration {

    public static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "eager";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }

    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}