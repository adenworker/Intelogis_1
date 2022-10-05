package ru.intelogis.guitests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.intelogis.steps.LoginSteps;

@Owner("alisichkin")
public class LoginTest extends TestBase {
    @Test
    @Tag("login")
    @DisplayName("Проверка работы логина на тестовой странице Intelogis")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Подключение Allure и аттачментов")
    @Story("Работа связки Java + Selenide + Allure")
    @Description("GUI тест с использованием Selenide")
    @Link(name = "Intelogis.ru", url = "https://ilswebreact-develop.azurewebsites.net/")
    void loginTest() {
        LoginSteps steps = new LoginSteps();

        steps.loginPageOpening();
        steps.setLogin();
        steps.setPassword();
        steps.clickSubmit();
        steps.loginResultChecking();
    }
}
