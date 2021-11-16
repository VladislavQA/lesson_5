package ui_tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class YandexTest extends BaseTest {

    @Test(description = "Проверка сообщения о неверном пароле/логине")
    public void checkIncorrectPasswordMsg() {

        new LoginPage().goToStartPage()
                .clickOnEnterButton()
                .setLogin("vlad-aqa")
                .clickOnSubmitButton()
                .setPassword("1234567a")
                .clickOnSubmitButton();
    }
}
