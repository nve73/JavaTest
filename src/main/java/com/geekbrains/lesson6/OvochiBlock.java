package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OvochiBlock extends BaseView {
    public OvochiBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='link-block ' and .='Помидоры']")
    private WebElement pomidoriText;

    public CatalogPomidoriPage clickPomidoriText(){
        pomidoriText.click();
        return new CatalogPomidoriPage(driver);
    }
}
