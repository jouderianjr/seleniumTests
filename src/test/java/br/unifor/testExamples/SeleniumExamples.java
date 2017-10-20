package br.unifor.testExamples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumExamples {

    private WebDriver driver;

    @BeforeEach
    public void getFirefoxDriver() {
        driver = new FirefoxDriver();
    }

    @AfterEach
    public void closeBrowser() {
//        driver.close();
    }

    @Test
    public void buttonDisabledWhenInputIsEmpty() {
        driver.get("http://gitelm.surge.sh");

        WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));

        assertFalse(searchButton.isEnabled());
    }

    @Test
    public void buttonEnabledWhenInputHasText() {
    }
}
