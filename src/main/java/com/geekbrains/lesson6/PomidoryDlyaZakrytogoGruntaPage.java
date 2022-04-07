package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomidoryDlyaZakrytogoGruntaPage extends BaseView {
    public PomidoryDlyaZakrytogoGruntaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@title='Помидоры Звездопад в августе']")
    private WebElement tomatoPicture;

    public PersonalTomatoCard clickTomatoCard() {
        tomatoPicture.click();
        return new PersonalTomatoCard(driver);
    }
}
