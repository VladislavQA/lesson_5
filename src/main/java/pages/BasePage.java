package pages;

import driver_manager.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BasePage {

    protected String startPage = "https://yandex.ru/";

    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
    }

    public WebElement findByXpath(String xpath, Duration duration) {
        return driver.findElement(waitForElementVisible(By.xpath(xpath), duration.getSeconds()));
    }

    public WebElement findByCss(String css, Duration duration) {
        return driver.findElement(waitForElementVisible(By.cssSelector(css), duration.getSeconds()));
    }

    private WebDriverWait getWaiter(long timeOutInSeconds) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutInSeconds);
        webDriverWait.ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
        return webDriverWait;
    }

    public By waitForElementVisible(By findStrategy, long timeOutInSeconds) {
        getWaiter(timeOutInSeconds).until(visibilityOfElementLocated(findStrategy));
        return findStrategy;
    }

    public StartPage goToStartPage() {
        DriverManager.getDriver().get(startPage);
        return new StartPage();
    }
}
