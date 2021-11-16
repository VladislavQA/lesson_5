package ui_tests;

import driver_manager.DriverManager;
import org.testng.annotations.AfterTest;

public class BaseTest {

    @AfterTest
    public void kill() {
        DriverManager.closeDriver();
    }
}
