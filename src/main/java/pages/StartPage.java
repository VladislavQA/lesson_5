package pages;

import java.time.Duration;

public class StartPage extends BasePage {

    public LoginPage clickOnEnterButton() {
        findByXpath("//*[contains(text(),'Войти')]/parent::a", Duration.ofSeconds(10)).click();
        return new LoginPage();
    }
}
