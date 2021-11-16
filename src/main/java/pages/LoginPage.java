package pages;

import java.time.Duration;

public class LoginPage extends BasePage {

    public LoginPage setLogin(String login) {
        findByCss("#passp-field-login", Duration.ofSeconds(10)).sendKeys(login);
        return this;
    }

    public LoginPage clickOnSubmitButton() {
        findByCss("[type='submit']", Duration.ofSeconds(10)).click();
        return this;
    }

    public LoginPage setPassword(String password) {
        findByCss("#passp-field-passwd", Duration.ofSeconds(10)).sendKeys(password);
        return this;
    }
}
