package ru.intelogis.steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginSteps {
    @Step("Открываем тестовую страницу")
    public void loginPageOpening() {
        Selenide.open("https://ilswebreact-develop.azurewebsites.net/");
    }

    @Step("Вводим логин")
    public void setLogin() {
        $("#login").setValue("rekame2869@seinfaq.com");
    }

    @Step("Вводим пароль")
    public void setPassword() {
        $("#password").setValue("XRCa91zn4fsJzcHW");
    }

    @Step("Жмем на кнопку Войти")
    public void clickSubmit() {
        $("[type='submit']").$(byText("Войти")).click();
    }

    @Step("Проверяем, что залогинились")
    public void loginResultChecking() {
        $(".current-user").shouldHave(text("Тестер"));
    }
}
