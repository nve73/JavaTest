package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPomidoriPage extends BaseView {
    public CatalogPomidoriPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[.='Для закрытого грунта']")
    private WebElement dlaZakritogoGruntaButton;

    public PomidoryDlyaZakrytogoGruntaPage clickDdlaZakritogoGruntaButton(){
        dlaZakritogoGruntaButton.click();
        return new PomidoryDlyaZakrytogoGruntaPage(driver);
    }

}
