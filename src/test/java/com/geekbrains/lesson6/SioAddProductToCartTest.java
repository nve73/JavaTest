package com.geekbrains.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SioAddProductToCartTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        //driver = new EventFiringDecorator(new CustomLogger()).decorate(new ChromeDriver());
    }

    @Test
    void addToCartTest() throws InterruptedException {
        driver.get("https://sad-i-ogorod.ru/");

        new MainPage(driver)
                .clickCookieAgreeButton()
                .clickSemenaButton()
                .clickOvochiText()
                .clickPomidoriText()
                .clickDdlaZakritogoGruntaButton()
                .clickTomatoCard()
                .clickAddInCartButton();
        Assertions.assertEquals(driver.findElement(By.xpath("//span[.='В корзине']")).getText(), "В корзине");
        Thread.sleep(5000);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

}
