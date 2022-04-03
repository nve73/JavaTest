package com.geekbrains;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


//import java.time.Duration;


public class SioTest {
    WebDriver driver;
    //    WebDriverWait webDriverWait;
//    Actions actions;
    private final static String SIO_BASE_URL = "https://sad-i-ogorod.ru/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver() {
        driver = new ChromeDriver();
//        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        actions = new Actions(driver);
        driver.get(SIO_BASE_URL);
    }

    @Test
    void AddingProductCartTest() throws InterruptedException {

        driver.findElement(By.xpath("//a[@class='cookie-msg__button']")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'catalog')]//span[.='Семена']")).click();
        driver.findElement(By.xpath("//div[@class='panel-title']//a[.='Овощи']")).click();
        driver.findElement(By.xpath("//a[@class='link-block ' and .='Помидоры']")).click();
        driver.findElement(By.xpath("//a[.='Для закрытого грунта']")).click();
        driver.findElement(By.xpath("//img[@title='Помидоры Звездопад в августе']")).click();
        driver.findElement(By.xpath("//button[@class='btn full-width to-cart-btn']")).click();
        Assertions.assertEquals(driver.findElement(By.xpath("//span[.='В корзине']")).getText(), "В корзине");

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }


}
