package com.example.tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.SeverityLevel.NORMAL;
import static org.assertj.core.api.Assertions.assertThat;

public class SmeTest {

    @BeforeEach
    public void setUp() {
        Selenide.open("https://alfabank.ru/sme/"); // замените на ваш URL
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }

    @Test
    @DisplayName("Проверка заголовка страницы")
    @Severity(NORMAL)
    @Feature("Главная страница малого бизнеса")
    public void checkSMEMainPageTitle() {
        open("https://alfabank.ru/sme/");
        String expectedTitle = "Банк для бизнеса — Услуги и решения для среднего и малого бизнеса от \uD83C\uDD70\uFE0F Альфа-Банка";
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}