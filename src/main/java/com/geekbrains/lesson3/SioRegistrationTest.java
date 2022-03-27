package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SioRegistrationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://sad-i-ogorod.ru/register/");

        driver.findElement(By.xpath("//a[@class='cookie-msg__button']")).click();
        driver.findElement(By.name("surname")).sendKeys("Иванова");
        driver.findElement(By.name("name")).sendKeys("Лидия");
        driver.findElement(By.name("father")).sendKeys("Ивановна");
        driver.findElement(By.name("phone")).sendKeys("9205252525");
        driver.findElement(By.name("email")).sendKeys("li4044424@gmail.ru");
        driver.findElement(By.xpath("//div[@class=\"reg-section opened\"]//div[.=\"Далее\"]")).click();
        driver.findElement(By.name("daddress")).sendKeys("г Казань, ул Ленина, д 1, кв 5");
        driver.findElement(By.xpath("//div[@class=\"reg-section opened\"]//div[.=\"Далее\"]")).click();
        driver.findElement(By.name("password1")).sendKeys("123456Li");
        driver.findElement(By.name("password2")).sendKeys("123456Li");
        driver.findElement(By.xpath("//button[.=\"Зарегистрироваться\"]")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
